package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private final int base;
    private final int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public double getPerimeter() {
        return (base*2.0)+(height*2.0);
    }

    public double getArea() {
        return base * height;
    }

    public int getSidesCount() {
        return 4;
    }
}
