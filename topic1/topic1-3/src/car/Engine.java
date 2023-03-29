package car;

public class Engine {

    private boolean running;

    public Engine() {
        this.running = false;
    }

    public void start() {
        this.running = true;
    }

    public void stop() {
        this.running = false;
    }
    
}
