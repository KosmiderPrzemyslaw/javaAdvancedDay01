package Dzień_1_Klasy_abstrakcyjne;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected double calculateArea() {
        return a * b;
    }

    protected double calculateCircuit() {
        return 2 * a + 2 * b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach: " + " a = " + a + " b= " + b;
    }
}
