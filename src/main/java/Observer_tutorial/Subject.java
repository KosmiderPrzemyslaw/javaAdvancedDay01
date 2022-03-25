package Observer_tutorial;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;


    public Subject() {
        observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void addObserver(Observer observers){
        this.observers.add(observers);
    }

    public void startWork() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (Observer observer : observers
                ) {
                    observer.update();
                }

            }

        });
        thread.start();

    }
}