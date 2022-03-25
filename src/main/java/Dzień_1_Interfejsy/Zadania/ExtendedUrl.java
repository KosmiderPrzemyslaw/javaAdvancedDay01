package Dzień_1_Interfejsy.Zadania;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedUrl implements Url {
    @Override
    public String getParam(String name, String url) {
        String param = "";
        Pattern pattern = Pattern.compile(name + "\\.([^/]+)");
        Matcher matcher = pattern.matcher(url);

        if(matcher.find()){
            param = matcher.group(1);
        }
        return param;
    }
}
