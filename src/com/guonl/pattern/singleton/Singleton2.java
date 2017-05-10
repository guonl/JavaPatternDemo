package com.guonl.pattern.singleton;

/**
 * 懒汉模式：当类加载的时候，比并没有初始化实例，而是在用户获取的时候才初始化，所以叫 懒汉式
 *
 * 区别：饿汉模式，类的加载比较慢，但是运行获取对象的速度比较快，线程是安全的
 *      懒汉模式，类的加载比较快，但是运行获取对象的速度比较慢，线程不安全
 */

//懒汉模式
public class Singleton2 {
	
	//1、将构造方法私有化，不允许外部直接创建对象
	private Singleton2() {
		
	}
	
	//2、创建类的唯一实例，使用private static变成为类的静态成员
	private static Singleton2 instance;
	
	//3、提供一个获取实例的方法，使用public static修饰
	public static Singleton2 getInstance(){
		
		if(instance == null){
			instance = new Singleton2();
		}
		
		return instance;
	}

}
