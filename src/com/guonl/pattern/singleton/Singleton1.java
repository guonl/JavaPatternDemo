package com.guonl.pattern.singleton;

/**
 * 
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就足够了，如古代的皇帝、老婆
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉式、懒汉式
 */

//饿汉模式：只要类一加载，它就开始初始化，永远都是没有吃饱，所以叫饿汉式

public class Singleton1 {
	
	//1、将构造方法私有化，不允许外部直接创建对象
	private Singleton1() {
		
	}
	
	//2、创建类的唯一实例，使用private static变成为类的静态成员
	private static Singleton1 instance = new Singleton1();
	
	//3、提供一个获取实例的方法，使用public static修饰
	public static Singleton1 getInstance(){
		
		return instance;
	}

}
