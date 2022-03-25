package Interfejsy_Funkcyjne;

@FunctionalInterface
public interface Filter2<K, V> {
    boolean checkKeyValue(K k, V v);
}
