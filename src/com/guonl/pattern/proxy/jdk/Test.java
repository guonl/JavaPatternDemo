package com.guonl.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import com.guonl.pattern.proxy.Car;
import com.guonl.pattern.proxy.Moveable;


/*
 * JDK动态代理测试类
 */
public class Test {

	public static void main(String[] args) {

		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		
		/*
		 * loader		类加载器
		 * interfaces	实现接口
		 * h			InvocationHandler
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		
		System.out.println("代理类的名字：" + m.getClass().getName());
		
		m.move();
		
	}

}
