package org.example.chapter1_strategy.duck;


import org.example.chapter1_strategy.duck.concretestrategy.BeepBeepQuack;
import org.example.chapter1_strategy.duck.context.Duck;
import org.example.chapter1_strategy.duck.context.EastAngleDuck;
import org.example.chapter1_strategy.duck.concretestrategy.RightAngleFly;
import org.junit.jupiter.api.Test;

class DuckTest {

    @Test
    void test(){
        Duck duck = new EastAngleDuck(
                new RightAngleFly(),
                new BeepBeepQuack()
        );

        duck.performFly();
        duck.performQuack();
    }
}