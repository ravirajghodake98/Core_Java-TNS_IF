package com.cg.list;

import java.util.*;
//array list internally uses the array
public class ArrayListExample {

	public static void main(String[] args) {
		//declare the array list from collection class
//		List<Integer>obj=new ArrayList<Integer>();
//		obj.add(11);
//		obj.add(13);
//		obj.add(15);
		
		//declare the array list from collection class with mixed data types
		ArrayList<Object>obj=new ArrayList<>();
		//ArrayList obj=new ArrayList();           //Another method to create object here 
		obj.add("Raviraj");
		obj.add(13);
		obj.add(15.30);
		obj.add(13);
		
		System.out.println("ArrayList elements are: "+obj);
		System.out.println("ArrayList size is: "+obj.size());  //to get size of array
		System.out.println(obj.contains(15.30));   //to check the parameter passes is there in array list or not
		System.out.println("The index is: "+obj.indexOf("Raviraj"));    //to check index
		System.out.println("The last index is: "+obj.lastIndexOf(13));
		System.out.println(obj.set(1,'R'));
		System.out.println(obj.isEmpty());
		System.out.println("ArrayList elements after setting are: "+obj);
	}

}