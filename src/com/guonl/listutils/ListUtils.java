package com.guonl.listutils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListUtils {
	
	
	public static List<String> removeDup(List<String> list){
		 Set<String> set = new HashSet<>();
         List<String> newList = new ArrayList<>();
         set.addAll(list);
         newList.addAll(set);
		return newList;
	}
	
	public static void main(String[] args) {
		List<String> list  =   new  ArrayList<String>(); 
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aaa");
        List<String> newList = removeDup(list);
        for (String string : newList) {
			System.out.println(string);
		}
		
	}

}
