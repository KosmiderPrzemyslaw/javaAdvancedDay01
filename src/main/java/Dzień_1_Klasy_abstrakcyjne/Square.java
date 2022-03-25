package Dzień_1_Klasy_abstrakcyjne;

public class Square extends Shape {
    public Square(double a) {
        this.a = a;
    }

    private double a;
    protected double calculateArea() {
        return a*a;
    }

    protected double calculateCircuit() {
        return 4*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku: " + a;
    }
}
