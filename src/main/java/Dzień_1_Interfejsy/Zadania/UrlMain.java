package Dzień_1_Interfejsy.Zadania;

public class UrlMain {
    public static void main(String[] args) {
        StandardUrl standardUrl = new StandardUrl();
        String paramFromFirstUrl = standardUrl.getParam("param2", "url_example?param1=99&param2=string");
        System.out.println(paramFromFirstUrl);

        Url url = new ExtendedUrl();
        String paramFromSecondUrl = url.getParam("param1", "url_example/param1.55/param2.byte");
        System.out.println(paramFromSecondUrl);
    }
}
