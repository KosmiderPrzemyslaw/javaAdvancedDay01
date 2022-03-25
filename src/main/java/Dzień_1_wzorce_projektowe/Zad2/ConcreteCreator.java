package Dzień_1_wzorce_projektowe.Zad2;

public class ConcreteCreator implements Creator {
    @Override
    public Product createProduct(String type) {
        Product product = null;
        if (type.equals("advancedProduct")) {
            product = new AdvancedProduct();
        } else if (type.equals("simpleProduct")) {
            product = new SimpleProduct();
        } else if (type.equals("virtualProduct")) {
            product = new VirtualProduct();
        }
        return product;
    }
}
