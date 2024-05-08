package org.example.chapter4_factory.pizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Tomato()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new AsiaPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
