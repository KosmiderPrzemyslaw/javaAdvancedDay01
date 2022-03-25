package Generyki_Prezentacja;

public class Main {
    public static void main(String[] args) {

        BoxWithGenerics boxWithGenerics = new BoxWithGenerics();
        Object element = boxWithGenerics.getElement();
        System.out.println(element);

        Box<Long> box = new Box();


    }
}
