package org.example.chapter1_strategy.duck.context;

import org.example.chapter1_strategy.duck.strategy.FlyBehavior;
import org.example.chapter1_strategy.duck.strategy.QauckBehavior;

public class EastAngleDuck extends Duck {

    public EastAngleDuck(FlyBehavior flyBehavior, QauckBehavior qauckBehavior) {
        super(flyBehavior, qauckBehavior);
    }

    @Override
    void display() {
        System.out.println("늠름하게 생긴 새에요!");
    }
}
