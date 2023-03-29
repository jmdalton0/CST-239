package app;

public class ServerThread extends Thread {

    @Override
    public void run() {
        Server server = new Server();
        server.start(8080);
    }

}
