package app;

import java.util.Random;

public class Game {

    /**
     * Creates a Batman object and a Superman object and causes them to attack eachother until one is dead.
     * @param args Program arguments.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int supermanHealth = rand.nextInt(1, 1000);
        int batmanHealth = rand.nextInt(1, 1000);

        System.out.println("Creating Superheroes...");
        Superman superman = new Superman(supermanHealth);
        Batman batman = new Batman(batmanHealth);
        System.out.println("Superheroes created");

        System.out.println("Fighting Superheroes...");
        while(!superman.isDead() && !batman.isDead()) {
            superman.attack(batman);
            batman.attack(superman);
            System.out.println();
        }

        if (superman.isDead()) {
            System.out.println("Batman defeated Superman");
        } else {
            System.out.println("Superman defeated Batman");
        }
    }
}
