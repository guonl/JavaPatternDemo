package com.guonl.pattern.adapter;

/*
 * 两孔转三孔插座的适配器
 */
public class TwoPlugAdapter implements ThreePlugIF {
	
	private GBTwoPlug plug;

	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("转化成功。。。");
		plug.powerWithTwo();

	}

}
