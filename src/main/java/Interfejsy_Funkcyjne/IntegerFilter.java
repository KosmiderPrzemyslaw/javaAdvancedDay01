package Interfejsy_Funkcyjne;

public class IntegerFilter implements Filter<Integer> {

    @Override
    public boolean check(Integer v) {
        return v < 20;
    }
}
