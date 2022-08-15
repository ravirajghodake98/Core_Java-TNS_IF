package com.cg.set;
import java.util.*;

public class SortedSetExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<String>();
		//it will sort the string in ascending order
		s.add("Abstract");
		s.add("Allows");
		s.add("Adds");
		s.add("Apple");
		s.add("Azad");
		System.out.println(s);
		
		//with put and entry method
		SortedMap<String, String> t1 = new
				TreeMap<String,String>();
				t1.put("Father", "Farmer");
				t1.put("Mother", "Teacher");
				t1.put("Son", "Engineer");
				t1.put("Daughter", "Doctor");
				t1.put("Cousin", "Manager");
				for(SortedMap.Entry m:t1.entrySet())
				{
				System.out.println(m.getKey()+" "+m.getValue());
				}
	}
}