package org.example.chapter2_observer.order;

import java.util.ArrayList;
import java.util.List;

public class HallScreen implements Observer, DisplayElement{
    private List<Integer> completedOrder = new ArrayList<>();
    private final OrderData orderData;

    public HallScreen(OrderData orderData) {
        this.orderData = orderData;
        orderData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HallScreen{" +
                "completedOrder=" + completedOrder +
                '}';
    }

    @Override
    public void update() {
        this.completedOrder = orderData.getCompletedOrderList();
        display();
    }
}
