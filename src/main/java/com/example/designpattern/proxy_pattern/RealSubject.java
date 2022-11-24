package com.example.designpattern.proxy_pattern;

public class RealSubject implements Subject{
  @Override
  public String operation() {
    System.out.println("리얼 객체 호출 됨");
    sleep();
    return "data";
  }

  private static void sleep() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }


}
