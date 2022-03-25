package Interfejsy_Funkcyjne;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 50, 60);
        Filter<Integer> filter = new IntegerFilter();
        printList(integerList, filter);

        Filter2<Integer, String> filter2 = new KeyValueFilter();

        boolean isCorrectKeyAndValue = filter2.checkKeyValue(4, "Jurek");
        System.out.println("Value is: " + isCorrectKeyAndValue);

        Filter<Integer> filterAnnonymous = new Filter<Integer>() {
            @Override
            public boolean check(Integer v) {
                return v < 20;
            }
        };

        System.out.println(filterAnnonymous.check(10));
        System.out.println(filterAnnonymous.check(20));
        System.out.println(filterAnnonymous.check(19));

        Filter<Integer> filtraLambda = z -> z < 20;
        printList(integerList, z -> z < 20);
    }

    static <T> void printList(List<T> src, Filter<T> filter) {
        for (T s : src
        ) {
            if (filter.check(s)) {
                System.out.println(s);
            }
        }
    }
}
