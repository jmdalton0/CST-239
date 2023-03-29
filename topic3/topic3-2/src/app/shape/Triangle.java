package shape;

import base.Shape;

public class Triangle extends Shape {

    public Triangle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public int calculateArea() {
        return width * height / 2;
    }

}
