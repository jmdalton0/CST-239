package com.example.store;

import com.example.model.Product;

/**
 * Product List used as the shopping cart of a user.
 */
public class Cart extends ProductList {

    private double subtotal;

    /**
     * Constructor
     */
    public Cart() {
        super();
        subtotal = 0.0;
    }

    /**
     * Get the cart subtotal
     * @return total price of each item in the cart
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * List all items in the cart
     */
    @Override
    public void list() {
        if (size() > 0) {
            super.list();
            for (int i = 0; i < size(); i++) {
                System.out.format(IND_FORMAT, i + 1);
                System.out.println(products.get(i).toString());
            }
            System.out.println("Subtotal: $" + subtotal);
        } else {
            System.out.println("Your cart is empty");
        }
    }

    /**
     * Add a product to the cart
     * @param product
     */
    @Override
    public void addProduct(Product product) {
        super.addProduct(product);
        subtotal += product.getPrice() * product.getQuantity();
    }

    /**
     * Remove a product from the cart
     * @param product A product object containing the name and amount of the product to remove
     * @return The removed product and amount
     */
    @Override
    public Product removeProduct(Product product) {
        Product removed = super.removeProduct(product);
        if (removed != null) {
            subtotal -= product.getPrice() * product.getQuantity();
        }
        return removed;
    }

}
