package com.cg.generics;

import java.util.*;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer> obj = new LinkedList<Integer>();
		obj.add(11);
		obj.add(13);
		//1. First advantage of Generic: Type-safe
		//3.Third advantage of Generic: Compile-time checking 
//		obj.add("13");
		System.out.println(obj);
		
		//2. Second advantage of Generic: Type-casting is not required (no need to type cast the object)
		//Type casting  is a way of changing one data type into other
		List<String> obj1 = new LinkedList<String>();
//		List obj1 = new LinkedList();
		obj1.add("10");
		obj1.add("20");
		obj1.add("30");
		String str=obj1.get(1);
		//Type casting explicitly if there is not an object type
//		String str=(String)obj1.get(1);
		System.out.println(str);
	}
}