package org.example.chapter3_decorator.starbucks.concreteDecorator;

import org.example.chapter3_decorator.starbucks.component.Beverage;
import org.example.chapter3_decorator.starbucks.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
