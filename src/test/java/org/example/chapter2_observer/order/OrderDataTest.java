package org.example.chapter2_observer.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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