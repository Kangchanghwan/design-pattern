package com.example.designpattern.strategy_pattern;



public class ContextV1 {

  private final Strategy strategy;

  public ContextV1(Strategy strategy) {
    this.strategy = strategy;
  }

  public void execute(){
    System.out.println("실행전===========");
    strategy.call();
    System.out.println("실행후===========");
  }

}
