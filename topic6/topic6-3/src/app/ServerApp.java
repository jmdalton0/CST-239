package app;

public class ServerApp {

    public static void main(String[] args) {
        ServerThread serverThread = new ServerThread();
        serverThread.start();

        while(serverThread.isAlive()) {
            System.out.println(".");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
