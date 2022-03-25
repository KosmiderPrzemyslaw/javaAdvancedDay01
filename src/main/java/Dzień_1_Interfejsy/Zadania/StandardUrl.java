package Dzień_1_Interfejsy.Zadania;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandardUrl implements Url {

    @Override
    public String getParam(String name, String url) {
        String param = "";
        Pattern pattern = Pattern.compile(name + "=([^&]+)"); // ^ - OZNACZA POCZĄTEK WIERSZA
        // [^...] - OZNACZA JEDEN DOWOLNY ZNAK NIE ZNAJDUJĄCY SIĘ MIĘDZY NAWIASAMI.
        // "+" - JEDNO LUB WIĘCEJ WYSTĄPIEŃ POPRZEDZAJĄCEGO WYRAŻENIA
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            param = matcher.group(1);
        }
        return param;
    }
}
