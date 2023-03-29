package shape;

import base.Shape;

public class Trapezoid extends Shape {

    private int base1;
    private int base2;

    public Trapezoid(String name, int width, int height, int base1, int base2) {
        super(name, width, height);
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public int calculateArea() {
        return (base1 + base2) / 2 * height;
    }
    
}
