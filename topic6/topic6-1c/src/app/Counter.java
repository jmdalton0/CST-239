package app;

public class Counter {

    private static int count = 0;

    synchronized public static void increment() {
        count += 1;
    }

    public static int getCount() {
        return count;
    }

}
