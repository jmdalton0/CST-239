package com.example.model;

/**
 * Health Model class to be used in the store front.
 */
public class Health extends Product {
    
    private int health;

    /**
     * Default Constructor.
     */
    public Health() {
        super();
        health = 0;
    }

    /**
     * Health Model paramaterized constructor
     * @param product
     * @param health
     */
    public Health(String name, String description, double price, int quantity, int health) {
        super(name, description, price, quantity);
        this.health = health;
    }
    
    /**
     * Get the health health
     * @return The health health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Set the health health
     * @param health The health health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Return a string representation of the health
     */
    @Override
    public String toString() {
        return super.toString() + "   " + health + " health";
    }

    /**
     * Check if this health is equal to another instance of health
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof Health) {
            Health health = (Health) obj;
            if (health.health == this.health) {
                return true;
            }
        }
        return false;
    }

    /**
     * Copy this armor to a new instance
     */
    @Override
    public Health copy() {
        return new Health(name, description, price, quantity, health);
    }
}
