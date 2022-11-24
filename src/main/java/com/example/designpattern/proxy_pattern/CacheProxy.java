package com.example.designpattern.proxy_pattern;

import org.apache.commons.logging.Log;

import java.util.logging.Logger;

public class CacheProxy implements Subject{

  private Subject target;
  private String cacheData;

  public CacheProxy(Subject target) {
    this.target = target;
  }

  @Override
  public String operation() {

    System.out.println("프록시 실행");

    if(cacheData ==null) {
      cacheData = target.operation();
    }
    return cacheData;
  }
}
