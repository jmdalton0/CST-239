package app;

public abstract class Weapon {
    /**
     * Fire the weapon.
     * @param power Amount of power to fire.
     */
    public void fireWeapon(int power) {
        System.out.println("In Weapon.fireWeapon() with a power of " + power);
    }

    /**
     * Activate the weapon.
     * @param enable If the weapon should be enabled or not.
     */
    public abstract void activate(boolean enable);
}
