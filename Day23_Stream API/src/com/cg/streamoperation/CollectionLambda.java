package com.cg.streamoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>obj = new LinkedList<>();
		obj.add(11);
		obj.add(12);
		System.out.println(obj);
		/*for(Integer i: obj)
		{
			System.out.println(i);
		}*/
		
		//to print output in a single line using forEach
		//stream API operation
//		obj.forEach(i -> System.out.println(i));
		
		//to print output without lambda function
		obj.forEach(System.out::println);
	}

}
