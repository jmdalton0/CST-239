package com.example.model;

/**
 * Weapon Model class to be used in the store front.
 */
public class Weapon extends Product {

    private int damage;
    private int speed;
    private int crit;

    /**
     * Default Constructor.
     */
    public Weapon() {
        super();
        damage = 0;
        speed = 0;
        crit = 0;
    }

    /**
     * Weapon Model paramaterized constructor
     * @param product An instance of a Product parent class.
     * @param damage The amount of damage this weapon produces.
     * @param speed The rate at which this weapon can be used.
     * @param crit The chance of landing a critical hit.
     */
    public Weapon(String name, String description, double price, int quantity, int damage, int speed, int crit) {
        super(name, description, price, quantity);
        this.damage = damage;
        this.speed = speed;
        this.crit = crit;
    }

    /**
     * Get the weapon damage
     * @return The weapon damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Get the weapon speed
     * @return The weapon speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Get the weapon critical chance
     * @return The weapon critical chance
     */
    public int getCrit() {
        return crit;
    }

    /**
     * Set the weapon damage
     * @param damage The weapon damage
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Set the weapon speed
     * @param speed The weapon speed.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Set the weapon critical chance
     * @param crit The weapon critical chance
     */
    public void setCrit(int crit) {
        this.crit = crit;
    }

    /**
     * Return a string representation of the weapon
     */
    @Override
    public String toString() {
        return super.toString() + "   " + damage + " damage/" + speed + " speed/" + crit + " crit";
    }

    /**
     * Check if this weapon is equal to another instance of weapon
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (o instanceof Weapon) {
            Weapon weapon = (Weapon) o;
            if (
                weapon.damage == this.damage &&
                weapon.speed == this.speed &&
                weapon.crit == this.crit
            ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Copy this weapon to a new instance
     */
    @Override
    public Weapon copy() {
        return new Weapon(name, description, price, quantity, damage, speed, crit);
    }
}
