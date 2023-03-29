package racecar;

import car.Engine;
import car.Tire;

public class Racecar {

    private final int MAX_SPEED = 60;
    private final int NUM_TIRES = 4;

    private int speed;
    private Engine engine;
    private Tire[] tires;

    public Racecar() {
        this.speed = 0;
        this.engine = new Engine();
        this.tires = new Tire[NUM_TIRES];
        for (int i = 0; i < NUM_TIRES; i++) {
            tires[i] = new Tire();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > MAX_SPEED) {
            this.speed = MAX_SPEED;
        } else if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public void refillTires() {
        for (int i = 0; i < NUM_TIRES; i++) {
            tires[i].refill();
        }
    }

    public void start() {
        for (int i = 0; i < NUM_TIRES; i++) {
            if (tires[i].isFull()) {
                refillTires();
            }
        }
        engine.start();
    }

    public void stop() {
        engine.stop();
        speed = 0;
    }

    public void restart() {
        start();
        stop();
    }
}
