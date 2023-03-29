package app;

public interface PersonInterface {
    /**
     * Make a person walk.
     */
    public void walk();

    /**
     * Make a person run.
     */
    public void run();

    /**
     * Check if a person is running.
     * @return True if the person is running. False otherwise.
     */
    public boolean isRunning();
}
