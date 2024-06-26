package org.example.chapter4_factory.pizza;

import org.example.chapter4_factory.pizza.creator.NYPizzaIngredientFactory;

import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = factory.createDough();
        sauce = factory.createSauce();
        toppings.addAll(List.of(factory.createCheese(), factory.createPepperoni()));
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
