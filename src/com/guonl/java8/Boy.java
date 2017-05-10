package com.guonl.java8;

//男孩类
public class Boy extends Parent {
  public Boy(String name, int age) {
      super(name, age);
  }

  @Override
  public void doSome() {
      System.out.println("我是个男孩");
  }
}
