package org.example.chapter3_decorator.starbucks.decorator;

import org.example.chapter3_decorator.starbucks.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
