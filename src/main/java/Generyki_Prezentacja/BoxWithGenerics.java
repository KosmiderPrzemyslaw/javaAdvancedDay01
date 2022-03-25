package Generyki_Prezentacja;

public class BoxWithGenerics <T, S, V> {
    private T element;
    private S sElement;
    private V vElement;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
