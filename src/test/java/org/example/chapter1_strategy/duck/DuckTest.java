package org.example.chapter1_strategy.duck;


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