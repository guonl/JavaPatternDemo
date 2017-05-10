package com.guonl.pattern.proxy;

/*
 * 通过聚合的方式
 */
public class CarTimeProxy implements Moveable {

	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;
	
	@Override
	public void move() {
		
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		
		m.move();
		
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。" + "行驶时间：" + (endtime - starttime) + "毫秒");

	}

}
