package com.example.model;

import java.util.Formatter;

/**
 * Product Model class used in the store front.
 */
public class Product implements Comparable<Product> {

    public static final int NAME_WID = 30;
    public static final int QUANTITY_WID = 8;
    public static final int PRICE_WID = 9;
    
    private final String NAME_FORMAT = " %-" + NAME_WID + "s";
    private final String QUANTITY_FORMAT = " %-" + QUANTITY_WID + "d";
    private final String PRICE_FORMAT = " $%-" + PRICE_WID + ".2f";

    protected String name;
    protected String description;
    protected double price;
    protected int quantity;

    /**
     * Default Constructor.
     */
    public Product() {
        name = "";
        description = "";
        price = 0.0;
        quantity = 0;
    }

    /**
     * Product Model paramaterized constructor
     * @param name The name and primary identifier of the object
     * @param description A breif description of the object
     * @param price The floating point price of the object
     * @param quantity The amount of product represented by this object
     */
    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Get the product name
     * @return The product name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the product description
     * @return The product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the product price
     * @return The product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the product quantity
     * @return The product quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the product name
     * @param name The new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the product description
     * @param description The new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set the product price
     * @param price The new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Set the product quantity
     * @param quantity The new quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Return a string representation of the product
     * @return String representation of the product
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format(NAME_FORMAT, name);
        formatter.format(QUANTITY_FORMAT, quantity);
        formatter.format(PRICE_FORMAT, price);
        formatter.close();
        return sb.toString();
    }

    /**
     * Check if two products are equal
     * Does not check quantity
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Product) {
            Product product = (Product) obj;
            if (
                product.name.equals(this.name) &&
                product.description.equals(this.description) &&
                product.price == this.price
            ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Compare two Product objects according to name
     * @return 0 if equal, 1 if this is greater, or -1 if o is greater
     */
    @Override
    public int compareTo(Product o) {
        if (o instanceof Product) {
            Product product = (Product) o;
            return name.compareTo(product.getName());
        }
        throw new ClassCastException();
    }

    /**
     * Create a new Object with the same details as this product
     * @return The new Product Object
     */
    public Product copy() {
        return new Product(name, description, price, quantity);
    }
    
}
