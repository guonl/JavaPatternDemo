package com.guonl.distribution;

import java.util.Random;

public class RandomDemo {
	
	public static void main(String[] args) {
		//用于判断随机数的范围
		for (int i = 0; i <= 10; i++) {
			int rndNum = new Random().nextInt(0);
			System.out.println(rndNum);
		}
	}

}
