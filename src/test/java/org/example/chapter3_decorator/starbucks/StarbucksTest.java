package org.example.chapter3_decorator.starbucks;


import org.example.chapter3_decorator.starbucks.component.Beverage;
import org.example.chapter3_decorator.starbucks.concreteComponent.DarkRost;
import org.example.chapter3_decorator.starbucks.concreteComponent.Espresso;
import org.example.chapter3_decorator.starbucks.concreteComponent.HouseBlend;
import org.example.chapter3_decorator.starbucks.concreteDecorator.Mocha;
import org.example.chapter3_decorator.starbucks.concreteDecorator.Soy;
import org.example.chapter3_decorator.starbucks.concreteDecorator.Whip;
import org.junit.jupiter.api.Test;

class StarbucksTest {

    @Test
    void test(){
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "$" + espresso.cost());

        Beverage darkRost = new DarkRost();
        darkRost = new Mocha(darkRost);
        darkRost = new Mocha(darkRost);
        darkRost = new Whip(darkRost);
        System.out.println(darkRost.getDescription() + "$" + darkRost.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());
    }
}