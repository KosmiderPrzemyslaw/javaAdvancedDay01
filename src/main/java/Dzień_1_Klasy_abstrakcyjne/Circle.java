package Dzień_1_Klasy_abstrakcyjne;

public class Circle extends Shape {

    public Circle(double radius) {
        this.radius = radius;
    }

    private static final double pi = Math.PI;
    private double radius;

    double calculateArea() {
        return pi * Math.pow(radius, 2);
    }

    double calculateCircuit() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
