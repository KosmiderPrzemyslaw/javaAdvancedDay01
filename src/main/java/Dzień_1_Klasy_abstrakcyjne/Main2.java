package Dzień_1_Klasy_abstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class Main2
{
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<Shape>();

        Shape square = new Square(4.00);
        Shape circle = new Circle(4.00);
        Shape rectangle = new Rectangle(4,2);

        list.add(square);
        list.add(circle);
        list.add(rectangle);

        for (Shape s: list
             ) {
            System.out.println(s.calculateArea());
        }
    }
}
