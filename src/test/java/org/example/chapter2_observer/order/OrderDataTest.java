package org.example.chapter2_observer.order;

import org.example.chapter2_observer.order.concreteObserver.HallScreen;
import org.example.chapter2_observer.order.concreteObserver.KitchenScreen;
import org.example.chapter2_observer.order.concreteSubject.OrderData;
import org.junit.jupiter.api.Test;

class OrderDataTest {

    @Test
    void test(){

        OrderData orderData = new OrderData();

        DisplayElement hall = new HallScreen(orderData);
        DisplayElement kitchen = new KitchenScreen(orderData);

        orderData.setMeasurementsNewOrder(123);
        orderData.setMeasurementsNewOrder(124);
        orderData.setMeasurementsCompleteOrder(124);
        orderData.setMeasurementsCompleteOrder(123);

    }

}