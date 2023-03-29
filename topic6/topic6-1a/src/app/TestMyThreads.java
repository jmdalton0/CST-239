package app;

public class TestMyThreads {

    public static void main(String[] args) {
        System.out.println();

        MyThread1 t1 = new MyThread1();
        t1.start();

        Runnable runnable = new MyThread2();
        Thread t2 = new Thread(runnable);
        t2.start();
    }

}
