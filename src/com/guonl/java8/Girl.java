package com.guonl.java8;

//女孩类
public class Girl extends Parent {
  public Girl(String name, int age) {
      super(name, age);
  }

  @Override
  public void doSome() {
      System.out.println("我是个女孩");
  }
}
