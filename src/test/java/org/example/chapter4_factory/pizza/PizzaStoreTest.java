package org.example.chapter4_factory.pizza;

import org.example.chapter4_factory.pizza.concreteProduct.NYPizzaStore;
import org.example.chapter4_factory.pizza.product.PizzaStore;
import org.junit.jupiter.api.Test;

class PizzaStoreTest {

    @Test
    void test(){
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
    }

}