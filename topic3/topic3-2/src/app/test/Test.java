package test;

import base.Shape;
import shape.Circle;
import shape.Rectangle;
import shape.Trapezoid;
import shape.Triangle;

public class Test {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle("Rectanlge", 10, 200);
        shapes[1] = new Triangle("Triangle", 10, 50);
        shapes[2] = new Trapezoid("Trapezoid", 10, 10, 30, 40);
        shapes[3] = new Circle("Circle", 10, 100);

        System.out.println();
        for (int i = 0; i < shapes.length; i++) {
            displayArea(shapes[i]);
        }
    }

    private static void displayArea(Shape shape) {
        System.out.println("This is a shape named " + shape.getName() + " with an area of " + shape.calculateArea());
    }
}
