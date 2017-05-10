package com.guonl.java8;

//工厂类接口
public interface Factory<T extends Parent> {
  T create(String name,int age);
}
