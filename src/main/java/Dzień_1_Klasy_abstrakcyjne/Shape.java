package Dzień_1_Klasy_abstrakcyjne;

public abstract class Shape {
    private double circut;
    private double area;
    private String color;

 protected abstract double calculateArea();
 protected abstract double calculateCircuit();
}
