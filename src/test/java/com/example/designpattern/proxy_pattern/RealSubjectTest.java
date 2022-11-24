package com.example.designpattern.proxy_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealSubjectTest {

  @Test
  public void noProxyPatternTest() {

    ProxyPatternClient proxyPatternClient = new ProxyPatternClient(new RealSubject());

    proxyPatternClient.execute();
    proxyPatternClient.execute();
    proxyPatternClient.execute();
  }

  @Test
  public void cacheProxyTest() {

    RealSubject realSubject = new RealSubject();
    CacheProxy cacheProxy = new CacheProxy(realSubject);
    ProxyPatternClient proxyPatternClient = new ProxyPatternClient(cacheProxy);
    proxyPatternClient.execute();
    proxyPatternClient.execute();
    proxyPatternClient.execute();
    proxyPatternClient.execute();


  }


}