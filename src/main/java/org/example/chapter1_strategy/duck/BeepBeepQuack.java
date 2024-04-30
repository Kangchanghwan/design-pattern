package org.example.chapter1_strategy.duck;

public class BeepBeepQuack implements QauckBehavior {

    @Override
    public void quack() {
        System.out.println("나는 빕빕하는 소리를 내지!");
    }
}
