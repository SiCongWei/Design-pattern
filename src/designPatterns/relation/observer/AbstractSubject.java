package designPatterns.relation.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

    private Vector<Observer> observers = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        Enumeration<Observer> observerEnumeration =  observers.elements();
        while (observerEnumeration.hasMoreElements()){
            observerEnumeration.nextElement().update();
        }
    }

}
