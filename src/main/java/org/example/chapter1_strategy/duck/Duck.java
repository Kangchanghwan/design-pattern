package org.example.chapter1_strategy.duck;

public abstract class Duck {

    private final FlyBehavior flyBehavior;
    private final QauckBehavior qauckBehavior;

    public Duck(FlyBehavior flyBehavior, QauckBehavior qauckBehavior) {
        this.flyBehavior = flyBehavior;
        this.qauckBehavior = qauckBehavior;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack(){
        qauckBehavior.quack();
    }

    public void swim(){
        System.out.println("모든 오리는 물에 떠요!");
    }
}
