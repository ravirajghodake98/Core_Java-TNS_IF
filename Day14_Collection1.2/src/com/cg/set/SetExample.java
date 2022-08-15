package com.cg.set;

import java.util.*;

public class SetExample 
{
	public static void main(String[] args) 
	{
		//Set<Integer>obj=new HashSet<Integer>();
		Set<Object>obj=new HashSet<Object>();
		//Hash-set/set is unordered
		obj.add(45);
		obj.add("ravi");
		obj.add(15.06f);
		obj.add(null);
		obj.add(85);
		System.out.println(obj);
	}
}