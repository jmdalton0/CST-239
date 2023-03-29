package com.example.game;

import com.example.store.Store;

public class Game {

    /**
     * Main method of game
     * 
     * @param args program arguments
     */
    public static void main(String[] args) {
        System.out.println("\nHello and Welcome to the Java Store\n");

        Store store = new Store();
        store.shop();

        System.out.println("Thank you for shopping at the Java Store");
        System.out.println("Goodbye!");
    }
    
}
