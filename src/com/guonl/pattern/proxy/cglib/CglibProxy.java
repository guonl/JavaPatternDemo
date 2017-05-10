package com.guonl.pattern.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class clazz){
		
		//设置创建子类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
		
	}

	
	/*
	 * 拦截所有目标类方法的调用
	 * obj	目标类的实例
	 * m	目标方法的反射对象
	 * args	方法的参数
	 * proxy 代理类的实例
	 * 
	 * 
	 * 实现思路：
	 * 实现功能：通过proxy的newProxyInstance返回代理对象
	 * 1、声明一段源码（动态产生代理）
	 * 2、编译源码（JDK Compiler API） 产生新的类（代理类）
	 * 3、将这个类load到内存当中，产生一个新的对象（代理对象）
	 * 4、return 代理对象
	 * 
	 */
	@Override
	public Object intercept(Object obj, Method m, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		System.out.println("日志开始。。。");
		
		proxy.invokeSuper(obj, args);
		
		System.out.println("日志结束。。。");
		
		return null;
	}
	
	

}
