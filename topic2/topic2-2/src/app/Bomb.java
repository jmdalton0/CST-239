package app;

public class Bomb extends Weapon {
    /**
     * Fire the Bomb.
     * @param power Amount of power to fire.
     */
    @Override
    public void fireWeapon(int power) {
        System.out.println("In Bomb.fireWeapon() with a power of " + power);
    }

    /**
     * Fire the Bomb without power.
     */
    public void fireWeapon() {
        System.out.println("In overloaded Bomb.fireWeapon()");
        super.fireWeapon(10);
    }

    /**
     * Activate the Bomb.
     * @param enable If the bomb should be enabled or not.
     */
    @Override
    public void activate(boolean enable) {
        System.out.println("In Bomb.activate() with an enable of " + enable);
    }
}
