package com.cg.list;
import java.util.*;
//linked list internally uses the DLL
public class LinkedListExample {

	public static void main(String[] args) {
		//List obj=new LinkedList(); 
		LinkedList<Object>obj=new LinkedList<>();
		obj.add("Shabnam");
		obj.add(13);
		obj.add(15.30);
		obj.add(13);
		
		System.out.println("LinkedList elements are: "+obj);
		System.out.println("LinkedList size is: "+obj.size());  //to get size 
		System.out.println(obj.contains(15.30));   //to check the parameter passes is there or not
		System.out.println("The index is: "+obj.indexOf("Shabnam"));    //to check index
		System.out.println("The last index is: "+obj.lastIndexOf(13));
		System.out.println(obj.set(1,'R'));
		System.out.println(obj.isEmpty());
		System.out.println("ArrayList elements after setting are: "+obj);
	}

}