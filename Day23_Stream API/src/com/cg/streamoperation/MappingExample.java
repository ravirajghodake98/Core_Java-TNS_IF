package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj = Arrays.asList(new String[] {"Apple", "Banana", "Mango", "Pineapple"});
		System.out.println("Word length for object fruit: ");
		obj.stream().map(String::length).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		List<Integer>obj1 = Arrays.asList(new Integer[] {25,26,35,635,135,365});
		obj1.stream().map(i -> i*i).collect(Collectors.toList()).forEach(System.out::println);;
	}

}
