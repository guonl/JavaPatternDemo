package com.guonl.stringutils;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
//		Map<String, Object>
		Map<String, Object> map = getMapValue();
		String awId = (String) map.get("awId");
		String comment = (String) map.get("comment");
		System.out.println("awId:" + awId);
		System.out.println("comment:" + comment);
	}

	private static Map<String, Object> getMapValue() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("awId", "abc-123");
		map.put("comment", "测试");
		return map;
	}
	
	

}
