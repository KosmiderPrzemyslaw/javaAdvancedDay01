package Generics_tutorial_Exampl;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>();

        integerPrinter.print(55);
        integerPrinter.print(65);
        integerPrinter.print(75);

        Printer<String> stringPrinter = new Printer<>("string");
        stringPrinter.print(String.valueOf(44) + " 55");

    }

}
