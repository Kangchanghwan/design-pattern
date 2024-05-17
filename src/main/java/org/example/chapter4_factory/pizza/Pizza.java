package org.example.chapter4_factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Topping> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
        for (Topping topping : toppings) {
            System.out.println("Topping: " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking at 350 degrees for 25 minutes");
    }

   public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
