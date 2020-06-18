package dev.koodeu;

public class Square implements  Calcs{
    double side;
    public Square(double side){
        this.side=side;
    }

    @Override
    public double fieldOfRectangle(double x, double y) {
        return 0;
    }

    @Override
    public double fieldOfCircle(double r) {
        return 0;
    }

    @Override
    public double fieldOfSquare(double x) {
        return x*x;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double perimeterOfSquare(double x) {
        return 4*x;
    }

    @Override
    public double perimeterOfCircle(double r) {
        return 0;
    }

    @Override
    public double perimeterOfRectanle(double x, double y) {
        return 0;
    }
}
