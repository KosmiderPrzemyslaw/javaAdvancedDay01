package Dzień_1_wzorce_projektowe.Zad4;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
