package com.guonl.pattern.proxy;

/*
 * 测试类
 */
public class Client {

	public static void main(String[] args) {
		
		/************time在前，log在后*****************/
		Car car = new Car();
		CarTimeProxy ctp1 = new CarTimeProxy(car);
		CarLogProxy clp1 = new CarLogProxy(ctp1);
		clp1.move();
		System.out.println("====================================");
		//输出结果：
//		日志开始。。。
//		汽车开始行驶。。。
//		汽车行驶中。。。
//		汽车结束行驶。。。行驶时间：735毫秒
//		日志结束。。。
		/************日志在前，行驶在后****************/
		
		
		/************log在前，time在后*****************/
		CarLogProxy clp2 = new CarLogProxy(car);
		CarTimeProxy ctp2 = new CarTimeProxy(clp2);
		ctp2.move();
		
		//输出结果：
//		汽车开始行驶。。。
//		日志开始。。。
//		汽车行驶中。。。
//		日志结束。。。
//		汽车结束行驶。。。行驶时间：904毫秒
		/************行驶在前，日志在后****************/
		
		/**********代理的动态调用**************/
		
		
		
		
		
		
	}

}
