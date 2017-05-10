package com.guonl.pattern.cor.handler;

public class PriceHandlerFactory {

	/*
	 * 创建PriceHandler的工厂方法
	 */
	public static PriceHandler creatPriceHandler() {
		
		PriceHandler sales = new Sales();
		PriceHandler leader = new Leader();
		PriceHandler man = new Manager();
		PriceHandler dir = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler CEO = new CEO();
		
		sales.setSuccessor(leader);
		leader.setSuccessor(man);
		man.setSuccessor(dir);
		dir.setSuccessor(vp);
		vp.setSuccessor(CEO);
		
		return sales;//因为到任何的销售场所，接待你的都是销售人员
	}

}
