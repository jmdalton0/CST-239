package com.example.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.example.model.Product;

/**
 * Interface to an array of Products.
 */
public abstract class ProductList {

    private final int IND_WID = 2;

    protected final String IND_FORMAT = "%" + IND_WID + "d.";

    private String sortFeild;
    private boolean sortAscending;
    protected ArrayList<Product> products;

    /**
     * Constructor
     */
    public ProductList() {
        sortFeild = "Name";
        sortAscending = true;
        products = new ArrayList<Product>();
    }

    /**
     * Sort the products in the list according to sortField and sortAscending
     */
    protected void sort() {
        if (sortFeild == "Price") {
            Collections.sort(products, new PriceComparator());
        } else {
            Collections.sort(products);
        }

        if (!sortAscending) {
            Collections.reverse(products);
        }
    }

    /**
     * The number of products in the list
     * @return The number of products in the list
     */
    public int size() {
        return products.size();
    }

    /**
     * Remove all products
     */
    public void clear() {
        products.clear();
    }

    /**
     * List all the products in the list
     */
    public void list() {
        System.out.format("%" + (IND_WID + 1) + "s", "");
        System.out.format(" %-" + Product.NAME_WID + "s", "Name");
        System.out.format(" %-" + Product.QUANTITY_WID + "s", "Stock");
        System.out.format(" %-" + Product.PRICE_WID + "s", "Price");
        System.out.println();
    }

    /**
     * Set sortFeild
     * @param sortFeild A String representation of a Product field to be used for sorting
     */
    public void setSortFeild(String sortFeild) {
        this.sortFeild = sortFeild;
        sort();
    }

    /**
     * Set sortAscending
     * @param ascending True to sort in ascending order, False to sort in descending order
     */
    public void setSortAscending(boolean sortAscending) {
        this.sortAscending = sortAscending;
        sort();
    }

    /**
     * Select a product from the list by index
     * @param i Index of the product in the list
     * @return The product
     */
    public Product getProduct(int i) {
        return products.get(i);
    }

    /**
     * Return all products
     * @return All products in the list
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Add a product to the list
     * If the product exists, update the quantity
     * @param product The product to add
     */
    public void addProduct(Product product) {
        for (int i = 0; i < size(); i++) {
            Product cur = products.get(i);
            if (cur.equals(product)) {
                cur.setQuantity(cur.getQuantity() + product.getQuantity());
                sort();
                return;
            }
        }
        products.add(product);
        sort();
    }

    /**
     * Remove a product from the list
     * If the product exists, update the quantity
     * If the quantity drops below zero, remove the product completely
     * @param product
     * @return
     */
    public Product removeProduct(Product product) {
        for (int i = 0; i < size(); i++) {
            Product cur = products.get(i);
            if (cur.equals(product)) {
                int quantity = cur.getQuantity() - product.getQuantity();
                cur.setQuantity(quantity);
                if (quantity < 1) {
                    products.remove(cur);
                }
                return product;
            }
        }
        return null;
    }

    private class PriceComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}

