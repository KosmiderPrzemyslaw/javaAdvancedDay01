package Interfejsy_Funkcyjne;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V v);
}
