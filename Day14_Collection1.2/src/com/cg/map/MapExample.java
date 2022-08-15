package com.cg.map;
import java.util.*;

public class MapExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer,String> obj= new LinkedHashMap<Integer,String>();
		
//		If we use linkedHashMap it will give output as it is.
//		If we use HashMap it will give out asc. order of key 
		obj.put(2,"Shabnam");
		obj.put(1,"Siddhi");
		obj.put(3,"Abhi");
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.get(4));
		
		obj.remove(3);
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//if keys are same and values are different the it will print only one value which comes first alphabetically
	}
}