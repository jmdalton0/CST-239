package game;

import racecar.Racecar;

public class Game {

    public static void main(String[] args) {
        System.out.println("\n\nWELCOME TO THE RACE GAME\n");

        Racecar car = new Racecar();

        System.out.println("Ready for race 1?");
        System.out.println("Starting engine...");
        car.start();
        System.out.println("Engine started!");
        System.out.println("Current speed is " + car.getSpeed());
        System.out.println("Increasing speed to 80mpg");
        car.setSpeed(80);
        System.out.println("Current speed is " + car.getSpeed());
        System.out.println("FINISH... the race is over\n");

        System.out.println("Ready for race 2?");
        System.out.println("Restarting engine...");
        car.restart();
        System.out.println("Engine started!");
        System.out.println("Current speed is " + car.getSpeed());
        System.out.println("Increasing speed to 45mpg");
        car.setSpeed(45);
        System.out.println("Current speed is " + car.getSpeed());
        System.out.println("FINISH... the race is over\n");

        System.out.println("Stopping car...");
        car.stop();
        System.out.println("Car stopped");

        System.out.println("Thank you for playing");
    }

}
