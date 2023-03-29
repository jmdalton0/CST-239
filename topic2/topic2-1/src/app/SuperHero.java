package app;

import java.util.Random;

public class SuperHero  {
    private String name;
    private int health;
    private boolean isDead;

    public SuperHero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    
    /** 
     * Flag to track if the Super Hero is dead.
     * @return boolean
     */
    public boolean isDead() {
        return isDead;
    }

    
    /** 
     * Attack method to deal a random amount of damage to another Super Hero object.
     * @param opponent The Super Hero that is being dealt damage.
     */
    public void attack(SuperHero opponent) {
        Random rand = new Random();
        int damage = rand.ints(1, 11).findFirst().getAsInt();

        opponent.determineHealth(damage);
        System.out.print(String.format("%s has damage of %d and health of %d. ", opponent.name, damage, opponent.health));
    }

    
    /** 
     * Determines the health (minimum of 0) of a Super Hero after taking a specified amount of damage.
     * @param damage The amount of damage being dealt.
     */
    public void determineHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
            this.isDead = true;
        }
    }
}