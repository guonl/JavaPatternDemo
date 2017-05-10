package com.guonl.pattern.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		//饿汉式
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		if (s1 == s2) {
			System.out.println("s1和s2是同一个实例");
		}else{
			System.out.println("s1和s2不是同一个实例");
		}
		
		//懒汉式
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		
		if (s3 == s4) {
			System.out.println("s3和s4是同一个实例");
		}else{
			System.out.println("s3和s4不是同一个实例");
		}
	}

}
