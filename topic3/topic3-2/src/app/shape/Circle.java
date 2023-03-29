package shape;

import base.Shape;

public class Circle extends Shape {

    public Circle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * Math.pow((width / 2), 2));
    }
    
}
