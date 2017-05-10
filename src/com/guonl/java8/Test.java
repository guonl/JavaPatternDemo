package com.guonl.java8;

import java.util.List;


public class Test {

	public static void main(String[] args) {

		// 传统方式使用接口
		Transform<String, Integer> transform1 = new Transform<String, Integer>() {
			@Override
			public Integer transform(String s) {
				return Integer.valueOf(s);
			}
		};

		// Lambda方式使用接口,就是这么简单粗暴，没脾气
		Transform<String, Integer> transform2 = (s) -> Integer.valueOf(s);
	}

	public static void main1(String[] args) {
		// 传统方式
		Transform<String, Integer> transform1 = new Transform<String, Integer>() {
			@Override
			public Integer transform(String s) {
				return SumTest.strToInt(s);
			}
		};
		int result1 = transform1.transform("100");

		// Lambda方式
		Transform<String, Integer> transform2 = SumTest::strToInt;
		int result2 = transform2.transform("200");
	}

	public static void main2(String[] args) {
		// 传统方式
		Factory factory1 = new Factory() {
			@Override
			public Parent create(String name, int age) {
				return new Boy(name, age);
			}
		};
		Boy boy = (Boy) factory1.create("小明", 18);
		factory1 = new Factory() {
			@Override
			public Parent create(String name, int age) {
				return new Girl(name, age);
			}
		};
		Girl girl = (Girl) factory1.create("小红", 18);
		
		// Lambda方式
		Factory<Boy> boyFactory = Boy::new;
		Boy boy1 = boyFactory.create("小明", 18);
		Factory<Girl> girlFactory = Girl::new;
		Girl girl1 = girlFactory.create("小红", 18);
	}

}
