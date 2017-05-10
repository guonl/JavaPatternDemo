package com.guonl.pattern.factory;
/**
 * 新年系列加工厂
 * @author Administrator
 *
 */
public class NewYearFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new NewYearBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new NewYearGirl();
	}

}
