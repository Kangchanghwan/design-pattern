package org.example.chapter2_observer.weather.subject;

import org.example.chapter2_observer.weather.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
