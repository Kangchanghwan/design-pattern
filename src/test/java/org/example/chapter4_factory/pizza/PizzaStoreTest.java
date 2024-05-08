package org.example.chapter4_factory.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    @Test
    void test(){
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
    }

}