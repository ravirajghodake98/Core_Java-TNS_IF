package com.cg.set;
import java.util.*;

public class LinkedHashedSetExample {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		//LinkedHashSet is ordered
		obj.add(45);
		obj.add("ravi");
		obj.add(15.06f);
		obj.add(null);
		obj.add(85);
		System.out.println(obj);
	}
}