package Wzorce_Projektowe.Facade;

public class Facade {
    private Element1 element1;
    private Element2 element2;
    private Element3 element3;

    public Facade(Element1 element1, Element2 element2, Element3 element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public void method1(){
        this.element1.method1();
    }

    public void method2(){
        this.element2.method2();
    }

    public void method3(){
        this.element3.method3();
    }
}
