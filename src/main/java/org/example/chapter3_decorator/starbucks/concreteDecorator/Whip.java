package org.example.chapter3_decorator.starbucks.concreteDecorator;

import org.example.chapter3_decorator.starbucks.component.Beverage;
import org.example.chapter3_decorator.starbucks.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "휘핑";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
