package com.guonl.pattern.template;

public class TestTemplate {

	public static void main(String[] args) {

		System.out.println("咖啡制备中。。。");
		RefreshBeverage coffee = new Coffee();
		coffee.prepareBeverageTemplate();
		System.out.println("咖啡好了。。。");
		
		System.out.println("\n*******************************");
		System.out.println("茶制备中。。。");
		RefreshBeverage tea = new Tea();
		tea.prepareBeverageTemplate();
		System.out.println("茶好了。。。");
		
	}

}
