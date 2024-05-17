package org.example.chapter4_factory.pizza.concreteProduct;

import org.example.chapter4_factory.pizza.ChicagoStyleCheesePizza;
import org.example.chapter4_factory.pizza.Pizza;
import org.example.chapter4_factory.pizza.product.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
