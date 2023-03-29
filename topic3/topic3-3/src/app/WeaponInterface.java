package app;

public interface WeaponInterface {

    /**
     * Fire the weapon.
     */
    public void fireWeapon();

    /**
     * Fire the weapon.
     * @param power Amount of power to fire.
     */
    public void fireWeapon(int power);

    /**
     * Activate the weapon.
     * @param enable If the weapon should be enabled or not.
     */
    public void activate(boolean enable);

}
