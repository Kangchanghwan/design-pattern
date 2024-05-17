package org.example.chapter3_decorator.starbucks.concreteComponent;

import org.example.chapter3_decorator.starbucks.component.Beverage;

public class DarkRost extends Beverage {
    public DarkRost() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return .77;
    }
}
