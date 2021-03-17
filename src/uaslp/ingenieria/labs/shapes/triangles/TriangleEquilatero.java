package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;
    public String getName() {
        return "Equilateral Triangle";
    }

    public TriangleEquilatero(int side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 3;
    }

    public double getArea() {
        double raiz = Math.sqrt(3);
        return (raiz/4 * (side*side));
    }

    public int getSidesCount() {
        return 3;
    }
}
