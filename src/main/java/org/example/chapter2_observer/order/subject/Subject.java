package org.example.chapter2_observer.order.subject;

import org.example.chapter2_observer.order.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
