package com.example.store;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.model.Product;
import com.example.server.Server;

/**
 * Driver class used to provide a CLI to the store front.
 * Reads input from the user to choose a menu item then execute the associated command.
 */
public class Store {

    private Scanner scanner;

    private Inventory inventory;
    private Cart cart;

    /**
     * Constructor
     */
    public Store() {
        scanner = new Scanner(System.in);
        inventory = new Inventory();
        cart = new Cart();
        serve();
    }

    /**
     * Select a menu item to execute a shop command
     * @return the final cart of products
     */
    public ArrayList<Product> shop() {
        boolean shopping = true;
        while (shopping) {
            System.out.println("Choose a command:");
            System.out.print("(L)ist | (S)ort | (D)escribe | (P)urchase | (R)efund | (C)heckout | > ");
            char command = scanner.nextLine().charAt(0);
            System.out.println();
            switch (command) {
                case 'L': list();
                break;
                case 'S': sort();
                break;
                case 'D': describe();
                break;
                case 'P': purchase();
                break;
                case 'R': refund();
                break;
                case 'C': shopping = !checkout();
                break;
                default: continue;
            }
            System.out.println();
        }
        return cart.getProducts();
    }

    /**
     * Utility function to read an int within a range
     * @param min lower bound inclusive
     * @param max upper bound exclusive
     * @return user entered integer
     */
    private int getInt(int min, int max) {
        int entry = 0;
        boolean valid = false;
        while(!valid) {
            try {
                entry = Integer.parseInt(scanner.nextLine());
                if (entry < min || entry > max) {
                    System.out.print("Please enter a number between " + min + " and " + max + " > ");
                } else {
                    valid = true;
                }
            } catch (Exception e) {
                System.out.print("Please enter a number > ");
            }
        }
        return entry;
    }

    /**
     * List all products in the inventory
     */
    private void list() {
        inventory.list();
    }
    
    /**
     * Choose a preference for how inventory and cart should be sorted
     */
    private void sort() {
        System.out.println("Sorting options:");
        System.out.println("1. Name Ascending");
        System.out.println("2. Name Descending");
        System.out.println("3. Price Ascending");
        System.out.println("4. Price Descending");
        System.out.println();
        System.out.print("How would you like to set your sorting preferences > ");
        int ind = getInt(1, 4);

        String sortField = ind > 2 ? "Price" : "Name";
        boolean sortAscending = ind % 2 == 1;
        inventory.setSortFeild(sortField);
        inventory.setSortAscending(sortAscending);
        cart.setSortFeild(sortField);
        cart.setSortAscending(sortAscending);
    }

    /**
     * Describe a product in the inventory
     */
    private void describe() {
        if (inventory.size() > 0) {
            System.out.print("Which product would you like to describe > ");
            int ind = getInt(1, inventory.size());
            Product product = inventory.getProduct(ind - 1);
            System.out.println(product.getName() + ":");
            System.out.println(product.getDescription());
        } else {
            inventory.list();
        }
    }

    /**
     * Purchase a quantity of a product in the inventory
     */
    private void purchase() {
        if (inventory.size() > 0) {
            System.out.print("Which product would you like to purchase > ");
            int ind = getInt(1, inventory.size());
            Product product = inventory.getProduct(ind - 1).copy();
        
            System.out.print("How many > ");
            int quantity = getInt(1, product.getQuantity());

            System.out.println();
            product.setQuantity(quantity);
            inventory.removeProduct(product);
            cart.addProduct(product);
            System.out.println(Integer.toString(quantity) + " of product \"" + product.getName() + "\" have been added to your cart:");
            System.out.println();
            cart.list();
        } else {
            inventory.list();
        }
    }

    /**
     * Return a quantity of a product from your cart to the inventory
     */
    private void refund() {
        if (cart.size() > 0) {
            cart.list();
            System.out.println();
            System.out.print("Which product would you like to refund > ");
            int ind = getInt(1, cart.size());
            Product product = cart.getProduct(ind - 1).copy();

            System.out.println();
            cart.removeProduct(product);
            inventory.addProduct(product);
            System.out.println("All of product \"" + product.getName() + "\" have been returned from your cart:");
            System.out.println();
            cart.list();
        } else {
            System.out.println("Your cart is empty");
        }
    }

    /**
     * Finish shopping
     * @return
     */
    private boolean checkout() {
        cart.list();
        System.out.println();
        while(true) {
            System.out.print("Are you ready to checkout (Y/N) > ");
            char command = scanner.nextLine().charAt(0);
            if (command == 'Y') {
                return true;
            } else if (command == 'N') {
                return false;
            } else {
                System.out.print("Please enter \"Y\" for yes or \"N\" for no > ");
            }
        }
    }

    /**
     * Create an AdminService object in a new Thread to accomodate admin access to the store inventory
     * Admin adjustments to the inventory do not disrupt the user while interacting with the store
     */
    private void serve() {
        Server service = new Server(inventory);
        service.start();
    }
}