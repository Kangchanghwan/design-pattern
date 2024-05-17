package org.example.chapter4_factory.pizza.concreteProduct;

import org.example.chapter4_factory.pizza.NYStyleCheesePizza;
import org.example.chapter4_factory.pizza.Pizza;
import org.example.chapter4_factory.pizza.product.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
