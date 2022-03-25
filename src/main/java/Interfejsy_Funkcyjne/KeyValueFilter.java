package Interfejsy_Funkcyjne;

import java.util.*;

public class KeyValueFilter implements Filter2<Integer, String> {


    private Map<Integer, String> map = new HashMap<>();

    private Map<Integer, String> fillInTheMap(){
       map.put(1, "Janek");
       map.put(2, "Sandra");
       map.put(3, "Romek");
       map.put(4, "Jurek");
       map.put(5, "Andrzej");
       return map;
    }

    @Override
    public boolean checkKeyValue(Integer integer, String s) {
        Map<Integer, String> map = fillInTheMap();
        Set<Integer> keys = map.keySet();
       // List<Boolean> booleans = new ArrayList<>();
        for (Integer k:keys
             ) {
            String s1 = map.get(k);
            if (s1.equals(s) && integer.equals(k)){
                return true;
            }
        }
        return false;
    }
}
