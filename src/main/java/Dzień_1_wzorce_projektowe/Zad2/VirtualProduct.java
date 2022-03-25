package Dzień_1_wzorce_projektowe.Zad2;

public class VirtualProduct implements Product {

    @Override
    public String getName() {
        return VirtualProduct.class.getName();
    }
}
