package org.example.chapter1_strategy.duck;

public class RightAngleFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는 직각으로 나는 새야!");
    }
}
