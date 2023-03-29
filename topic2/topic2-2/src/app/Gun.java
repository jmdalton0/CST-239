package app;

public class Gun extends Weapon {
    /**
     * Fire the Gun.
     * @param power Amount of power to fire.
     */
    @Override
    public void fireWeapon(int power) {
        System.out.println("In Gun.fireWeapon() with a power of " + power);
    }

    /**
     * Fire the Gun without power.
     */
    public void fireWeapon() {
        System.out.println("In overloaded Gun.fireWeapon()");
        super.fireWeapon(5);
    }

    /**
     * Activate the Gun.
     * @param enable If the gun should be enabled or not.
     */
    @Override
    public void activate(boolean enable) {
        System.out.println("In Gun.activate() with an enable of " + enable);
    }
}
