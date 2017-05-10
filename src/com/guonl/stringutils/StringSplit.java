package com.guonl.stringutils;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String str = "eytr";
		splitString(str);
		
	}

	private static void splitString(String str) {
		
		String[] arr = str.split(",");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
