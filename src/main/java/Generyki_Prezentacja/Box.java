package Generyki_Prezentacja;

public class Box<T extends Number> {
    private T tElement;

    public T gettElement() {
        return tElement;
    }

    public void settElement(T tElement) {
        this.tElement = tElement;
    }

    public long getAsLong(){
        return tElement.longValue();
    }
}
