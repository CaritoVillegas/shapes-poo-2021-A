package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle {
    private final double base;
    private final double side;

    public IsoscelesTriangle(int side, int base) {
        this.side = side;
        this.base =base;
    }
    public String getName() {
        return "IsoscelesTriangle";
    }

    public double getPerimeter() {
        return (side * 2)+base;
    }

    public double getArea() {
        double h=Math.sqrt(Math.pow(side,2)-Math.pow((base/2),2));
        return (base*h)/2;
    }

    public int getSidesCount() {
        return 3;
    }


}
