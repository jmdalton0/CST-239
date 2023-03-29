package app;

public class Game {
    /**
     * Game Driver that calls all the methods of the objects it uses.
     * @param args Program arguments.
     */
    public static void main(String[] args) {
        Bomb bomb = new Bomb();
        Gun gun = new Gun();

        bomb.activate(true);
        gun.activate(true);

        bomb.fireWeapon(10);
        gun.fireWeapon(5);
        bomb.fireWeapon();
        gun.fireWeapon();
    }
}
