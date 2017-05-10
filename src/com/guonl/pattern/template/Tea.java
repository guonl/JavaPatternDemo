package com.guonl.pattern.template;

/*
 * 具体子类，提供了茶制备的具体实现
 */
public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用沸水浸泡茶叶5分钟");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入冰糖");
	}

}
