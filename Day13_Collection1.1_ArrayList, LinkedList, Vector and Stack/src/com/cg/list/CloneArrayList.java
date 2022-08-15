package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<Object>obj=new ArrayList<Object>();
		obj.add("Raviraj");
		obj.add(13);
		obj.add(15.30);
		obj.add(13);
		System.out.println("ArrayList elements are: "+obj);
		//Shallow copy of array list
		Object cloneList;
		cloneList=obj.clone();   //you cannot add or remove elements here(using clone method) as we are using obj from array list
		System.out.println(cloneList);
	}
}