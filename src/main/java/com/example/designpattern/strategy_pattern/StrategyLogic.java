package com.example.designpattern.strategy_pattern;
public class StrategyLogic implements Strategy{

  @Override
  public void call() {
    System.out.println("비즈니스 로직 실행");
  }

}
