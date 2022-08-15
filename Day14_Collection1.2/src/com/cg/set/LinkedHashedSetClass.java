package com.cg.set;
import java.util.*;

public class LinkedHashedSetClass {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		obj.add(45);
		obj.add("ravi");
		obj.add(15.06f);
		obj.add(null);
		obj.add(85);
		System.out.println(obj);
		//to extract the element of the set separately
		Object[] arr=obj.toArray();
		
		//using normal for loop
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		//using enhanced loop
		for(Object itr:arr)
		{
			System.out.println(itr);
		}
	}
}