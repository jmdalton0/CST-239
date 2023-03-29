package app;

import java.util.Random;

public class CounterThread extends Thread {

    @Override
    public void run() {
        try {
            Random rand = new Random();
            int sleeper = rand.nextInt(1000);
            Thread.sleep(sleeper);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Counter.increment();
    }

}
