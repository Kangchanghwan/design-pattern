package com.example.designpattern.strategy_pattern;

import org.junit.jupiter.api.Test;

class StrategyTest {


  @Test
  public void test () {


    Strategy strategy = () -> System.out.println("실행 될 함수");

    ContextV1 contextV1 = new ContextV1(strategy);

    contextV1.execute();




  }

}