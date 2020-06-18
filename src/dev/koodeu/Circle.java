package dev.koodeu;

public class Circle implements Calcs  {

        double radius;

        public Circle(double radius){
            this.radius=radius;
        }



    @Override
    public double fieldOfCircle(double r) {
        return Math.PI*r*r;
    }

    @Override
    public double fieldOfSquare(double x) {
        return 0;
    }

    @Override
    public double fieldOfRectangle(double x, double y) {
        return 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterOfSquare(double x) {
        return 0;
    }

    @Override
    public double perimeterOfCircle(double r) {
        return Math.PI*2*r;
    }

    @Override
    public double perimeterOfRectanle(double x, double y) {
        return 0;
    }
}


