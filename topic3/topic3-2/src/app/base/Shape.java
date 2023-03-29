package base;

public class Shape implements ShapeInterface {

    protected String name;
    protected int width;
    protected int height;

    public Shape(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public int calculateArea() {
        return -1;
    }

}
