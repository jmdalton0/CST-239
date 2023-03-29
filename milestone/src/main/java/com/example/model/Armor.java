package com.example.model;

/**
 * Armor Model class to be used in the store front.
 */
public class Armor extends Product {
    
    private int armor;
    private int regen;

    /**
     * Default Constructor.
     */
    public Armor() {
        super();
        armor = 0;
        regen = 0;
    }

    /**
     * Model Armor paramaterized constructor
     * @param product An instance of a Product parent class.
     * @param armor The amount of armor this armor provides.
     * @param regen The rate at which this armor regenerates health.
     */
    public Armor(String name, String description, double price, int quantity, int armor, int regen) {
        super(name, description, price, quantity);
        this.armor = armor;
        this.regen = regen;
    }
    
    /**
     * Get the armor armor
     * @return The armor armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Get the armor regeneration rate
     * @return The armor regeneration rate
     */
    public int getRegen() {
        return regen;
    }

    /**
     * Set the armor armor
     * @param armor
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * Set the armor regeneration rate
     * @param regen
     */
    public void setRegen(int regen) {
        this.regen = regen;
    }

    /**
     * Return a string representation of the armor
     */
    @Override
    public String toString() {
        return super.toString() + "   " + armor + " armor/" + regen + " regen";
    }

    /**
     * Check if this armor is equal to another instance of armor
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof Armor) {
            Armor armor = (Armor) obj;
            if (
                armor.armor == this.armor &&
                armor.regen == this.regen
            ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Copy this armor to a new instance
     */
    @Override
    public Armor copy() {
        return new Armor(name, description, price, quantity, armor, regen);
    } 
}
