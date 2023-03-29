package app;

public class Game {
    /**
     * Game Driver that calls all the methods of the objects it uses.
     * @param args Program arguments.
     */
    public static void main(String[] args) {
        System.out.println();

        WeaponInterface[] weapons = new WeaponInterface[2];
        weapons[0] = new Bomb();
        weapons[1] = new Gun();

        for (int i = 0; i < weapons.length; i++) {
            fireWeapon(weapons[i]);
        }
    }

    /**
     * Helper method that activates and fires a weapon.
     * @param weapon The weapon to activate and fire.
     */
    private static void fireWeapon(WeaponInterface weapon) {
        weapon.activate(true);
        weapon.fireWeapon(5);
    }
}
