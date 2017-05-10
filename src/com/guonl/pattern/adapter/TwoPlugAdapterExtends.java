package com.guonl.pattern.adapter;

/*
 * 采用继承式的插座适配器
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIF {

	@Override
	public void powerWithThree() {
		System.out.println("采用继承式的插座适配器。。。");
		this.powerWithTwo();

	}

}
