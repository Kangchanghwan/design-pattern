package com.example.designpattern.template_methord_pattern;

public abstract class  Template<T> {

  abstract T template();

  public void execute(){
    System.out.println("---------시작--------");
    template();
    System.out.println("---------끝--------");
  }

}
