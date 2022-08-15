package com.cg.generics;

import java.util.*;
import java.util.Map.Entry;

public class ExampleGenerics {

	public static void main(String[] args) {
		Map<Integer,String> obj= new HashMap<Integer,String>();
		obj.put(1, "Parag");
		obj.put(2, "Mahendra");
		obj.put(3, "Vinod");
		System.out.println(obj);
		
		Set<Map.Entry<Integer, String>> itr= obj.entrySet();
		Iterator<Map.Entry<Integer, String>> itr1= itr.iterator();
		while(itr1.hasNext())
		{
			//type casting is not required
//			Map.Entry e= itr1.next();   // this method can also be used
			Entry<Integer, String> e= itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}