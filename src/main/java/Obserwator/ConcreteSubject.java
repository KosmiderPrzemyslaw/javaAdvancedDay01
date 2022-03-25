package Obserwator;

import java.util.List;
import java.util.Observer;

public class ConcreteSubject implements Subject {
    private List<Obserwator.Observer> observerList;

    public ConcreteSubject(List<Obserwator.Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add((Obserwator.Observer) observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Obserwator.Observer observer: observerList
             ) {
            observer.update();
        }

    }
}
