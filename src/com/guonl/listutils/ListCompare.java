package com.guonl.listutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCompare {
	
	public static <T> List<T> compare(T[] t1, T[] t2) {    
	      List<T> list1 = Arrays.asList(t1);    
	      List<T> list2 = new ArrayList<T>();    
	      for (T t : t2) {    
	          if (!list1.contains(t)) {    
	              list2.add(t);    
	          }    
	      }    
	      return list2;    
	  }   
	  
	  public static void main(String[] arg){  
	        
		  List<String> list01 = new ArrayList<>();
		  List<String> list02 = new ArrayList<>();
		  //list01.add("123");
//		  list01.add("456");
		  
		  list02.add("123");
		  list02.add("456");
		  
		  List<String> list = compareList(list01,list02);
		  for (String string : list) {
			  System.out.println(string);
		}
	  }

	private static List<String> compareList(List<String> list01,
			List<String> list02) {
		List<String> list = new ArrayList<>();
		for (String value : list02) {
			if(!list01.contains(value)){
				list.add(value);
			}
		}
		return list;
	}  

}
