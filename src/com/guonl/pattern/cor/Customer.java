package com.guonl.pattern.cor;

import java.util.Random;

import com.guonl.pattern.cor.handler.PriceHandler;
import com.guonl.pattern.cor.handler.PriceHandlerFactory;

/*
 * 客户，请求折扣
 */
public class Customer {
	
	private PriceHandler priceHandler;

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}
	
	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.creatPriceHandler());
		
		Random random = new Random();
		
		for(int i=1;i<=100;i++){
			System.out.print(i+":");
			customer.requestDiscount(random.nextFloat());
		}
	}
	

}
