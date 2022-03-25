package Dzień_1_wzorce_projektowe.Zad2;

public class Main {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        Product advancedProduct = concreteCreator.createProduct("advancedProduct");
        System.out.println(advancedProduct.getClass().getName());

        Product simpleProduct = concreteCreator.createProduct("simpleProduct");
        System.out.println(simpleProduct.getClass().getName());

        Product virtualProduct = concreteCreator.createProduct("virtualProduct");
        System.out.println(virtualProduct.getClass().getName());
    }
}
