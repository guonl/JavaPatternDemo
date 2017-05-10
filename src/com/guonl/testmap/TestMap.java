package com.guonl.testmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		Hashtable<String, Object> table = new Hashtable<>();
		
		map.put("1", 1);
		map.put("1", 2);
		map.put("1", 3);
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {  
		    System.out.println("mapKey = " + entry.getKey() + ", mapValue = " + entry.getValue());  
		}  
		System.out.println("***************************");
		
		table.put("1", 1);
		table.put("1", 2);
		table.put("1", 3);
		
		for (Map.Entry<String, Object> entry : table.entrySet()) {  
		    System.out.println("tableKey = " + entry.getKey() + ", tableValue = " + entry.getValue());  
		}  
		
		
	}
	

}
