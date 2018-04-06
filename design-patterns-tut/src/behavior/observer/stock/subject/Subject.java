package behavior.observer.stock.subject;

import behavior.observer.stock.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);

        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(String stockSymbol, Double price) {
        for (Observer o : observers) {
            o.update(stockSymbol, price);
        }
    }
}