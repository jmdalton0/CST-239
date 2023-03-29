package car;

public class Tire {

    private final int MAX_PSI = 32;

    private int psi;

    public Tire() {
        this.psi = MAX_PSI;
    }

    public int getPsi() {
        return psi;
    }

    public void setPsi(int psi) {
        this.psi = psi;
    }

    public boolean isFull() {
        return psi == MAX_PSI;
    }

    public void refill() {
        psi = MAX_PSI;
    }

    public void leak(int psi) {
        psi -= psi;
    }
    
}
