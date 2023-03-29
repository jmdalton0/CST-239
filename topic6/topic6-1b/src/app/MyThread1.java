package app;

public class MyThread1 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread1 is running " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
