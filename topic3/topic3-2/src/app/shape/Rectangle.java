package shape;

import base.Shape;

public class Rectangle extends Shape {
    
    public Rectangle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public int calculateArea() {
        return width * height;
    }

}
