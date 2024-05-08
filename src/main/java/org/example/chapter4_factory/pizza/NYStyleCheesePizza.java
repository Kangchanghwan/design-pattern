package org.example.chapter4_factory.pizza;

import java.util.List;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        name = "NY Style Cheese Pizza";
        dough = factory.createDough();
        sauce = factory.createSauce();
        toppings.addAll(List.of(factory.createCheese(), factory.createPepperoni()));
    }
}
