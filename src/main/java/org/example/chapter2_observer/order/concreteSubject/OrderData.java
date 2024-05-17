package org.example.chapter2_observer.order.concreteSubject;

import org.example.chapter2_observer.order.observer.Observer;
import org.example.chapter2_observer.order.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class OrderData implements Subject {

    private List<Integer> newOrderList = new ArrayList<>();
    private List<Integer> completedOrderList = new ArrayList<>();

    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    private void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurementsNewOrder(final int newOrderNumber) {
        this.newOrderList.add(newOrderNumber);
        measurementsChanged();
    }
    public void setMeasurementsCompleteOrder(final int completeOrderNumber) {
        this.newOrderList.remove(Integer.valueOf(completeOrderNumber));
        this.completedOrderList.add(completeOrderNumber);
        measurementsChanged();
    }

    public List<Integer> getCompletedOrderList() {
        return completedOrderList;
    }

    public List<Integer> getNewOrderList() {
        return newOrderList;
    }
}
