package com.example.store;

/**
 * Product List used as the Inventory of the store front.
 */
public class Inventory extends ProductList {

    /**
     * Constructor
     */
    public Inventory() {
        super();
    }

    /**
     * List the products in inventory
     */
    @Override
    public void list() {
        if (size() > 0) {
            super.list();
            for (int i = 0; i < size(); i++) {
                System.out.format(IND_FORMAT, i + 1);
                System.out.println(products.get(i).toString());
            }
        } else {
            System.out.println("Sorry, we are completely out of stock");
        }
    }

}
