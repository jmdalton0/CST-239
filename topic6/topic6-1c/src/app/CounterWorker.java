package app;

public class CounterWorker {

    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        System.out.println("Initial count: " + Counter.getCount());

        CounterThread[] counters = new CounterThread[1000];

        for (int i = 0; i < 1000; i++) {
            counters[i] = new CounterThread();
        }

        for (int i = 0; i < 1000; i++) {
            counters[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            counters[i].join();
        }

        System.out.println("Final count: " + Counter.getCount());
    }
    
}
