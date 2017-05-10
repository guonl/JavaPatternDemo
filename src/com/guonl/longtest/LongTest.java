package com.guonl.longtest;

public class LongTest {
	
	public static void main(String[] args) {
		Long a = new Long(5000);
		Long b =  new Long(5000);
		System.out.println(a.equals(b));
		System.out.println(a.longValue() == b.longValue());
	}

}
