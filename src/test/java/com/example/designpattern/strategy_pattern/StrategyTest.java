package com.example.designpattern.strategy_pattern;

import org.junit.jupiter.api.Test;

class StrategyTest {


  @Test
  public void test () {

    //Strategy를 구현한 익명 클래스
    Strategy strategy = () -> System.out.println("실행 될 함수");

    ContextV1 contextV1 = new ContextV1(strategy);

    contextV1.execute();

  }

  @Test
  public void test2 () {

    //Strategy를 구현한 익명 클래스
    Strategy strategy = () -> System.out.println("실행 될 함수");

    ContextV2 contextV2 = new ContextV2();

    contextV2.execute(strategy);



  }

}