package org.example.chapter2_observer.order.concreteObserver;

import org.example.chapter2_observer.order.DisplayElement;
import org.example.chapter2_observer.order.concreteSubject.OrderData;
import org.example.chapter2_observer.order.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class KitchenScreen implements DisplayElement, Observer {

    private List<Integer> readyOrder = new ArrayList<>();
    private List<Integer> completedOrder = new ArrayList<>();
    private final OrderData orderData;

    public KitchenScreen(OrderData subject) {
        this.orderData = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "KitchenScreen{" +
                "readyOrder=" + readyOrder +
                ", completedOrder=" + completedOrder +
                ", orderData=" + orderData +
                '}';
    }

    @Override
    public void update() {
        this.readyOrder = orderData.getNewOrderList();
        this.completedOrder = orderData.getCompletedOrderList();
        display();

    }
}
