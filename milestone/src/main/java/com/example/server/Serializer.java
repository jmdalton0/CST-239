package com.example.server;

import java.io.IOException;
import java.util.ArrayList;

import com.example.model.Armor;
import com.example.model.Health;
import com.example.model.Product;
import com.example.model.Weapon;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Serializer {
    
    /**
     * Uses the Jackson JSON library to convert a JSON string to an ArrayList of Product objects
     * @param json JSON String to convert
     * @return The list of Products
     * @throws IOException If there is malformed JSON
     */
    public ArrayList<Product> fromJSON(String json) throws IOException {
        ArrayList<Product> products = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode nodes = (ArrayNode) mapper.readTree(json);

        for (int i = 0; i < nodes.size(); i++) {
            JsonNode node = nodes.get(i);
            json = mapper.writeValueAsString(node);

            if (
                node.get("name") != null &&
                node.get("description") != null &&
                node.get("price") != null &&
                node.get("quantity") != null
            ) {
                if (
                    node.get("damage") != null &&
                    node.get("speed") != null &&
                    node.get("crit") != null
                ) {
                    products.add(mapper.readValue(json, Weapon.class));
                } else if (
                    node.get("armor") != null &&
                    node.get("regen") != null
                ) {
                    products.add(mapper.readValue(json, Armor.class));
                } else if (
                    node.get("health") != null
                ) {
                    products.add(mapper.readValue(json, Health.class));
                } else {
                    products.add(mapper.readValue(json, Product.class));
                }
            } else {
                throw new IOException("Non Product object read from JSON");
            }
        }
        
        return products;
    }

    /**
     * Uses the Jackson JSON library to convert an ArrayList of Product objects to a JSON String
     * @param products The list of products
     * @return A JSON String
     * @throws IOException If there are any errors
     */
    public String toJSON(ArrayList<Product> products) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(products);
    }

}
