package dev.koodeu;

public class Rectangle implements Calcs {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double fieldOfRectangle(double x, double y) {
        return x*y;
    }

    @Override
    public double fieldOfCircle(double r) {
        return 0;
    }

    @Override
    public double fieldOfSquare(double x) {
        return 0;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double perimeterOfSquare(double x) {
        return 0;
    }

    @Override
    public double perimeterOfCircle(double r) {
        return 0;
    }

    @Override
    public double perimeterOfRectanle(double x, double y) {
        return 2*x + 2*y;
    }
}

