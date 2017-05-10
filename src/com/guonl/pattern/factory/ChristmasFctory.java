package com.guonl.pattern.factory;
/**
 * 圣诞系列加工厂
 * @author Administrator
 *
 */
public class ChristmasFctory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new ChristmasBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new ChristmasGirl();
	}

}
