package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private double sideA, sideB, sideC;

    public ScaleneTriangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }
    public String getName() {
        return "ScaleneTriangle";
    }

    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    public double getArea() {
    double sp=(sideA+sideC+sideB)/2;
    return (Math.sqrt(sp*(sp-sideA)*(sp-sideB)*(sp-sideC)));
    }

    public int getSidesCount() {
        return 3;
    }
}
