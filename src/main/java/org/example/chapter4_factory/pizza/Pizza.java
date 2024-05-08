package org.example.chapter4_factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    List<Topping> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
        for (Topping topping : toppings) {
            System.out.println("Topping: " + topping);
        }
    }

    void bake() {
        System.out.println("Baking at 350 degrees for 25 minutes");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }
}
