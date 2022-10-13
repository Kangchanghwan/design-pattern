package com.example.designpattern.strategy_pattern;


// 실행할 함수를 parameter로 받는다.
public class ContextV2 {

  public void execute(Strategy strategy){
    System.out.println("실행전===========");
    strategy.call();
    System.out.println("실행후===========");
  }

}
