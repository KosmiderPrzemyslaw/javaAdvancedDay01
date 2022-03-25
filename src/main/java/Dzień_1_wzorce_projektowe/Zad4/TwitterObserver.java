package Dzień_1_wzorce_projektowe.Zad4;

public class TwitterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("Tweeter obserwer " + title);
    }
}
