package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		//stream can be created with static data
		Stream<String>obj = Stream.of("Raviraj","Starlord");
		obj.forEach((i) -> System.out.print(i + " "));
		System.out.println();
		
		//stream can be acquired from array or collections
		List<String>obj1 = Arrays.asList(new String[] {"Pune", "Mumbai", "Bangalore"});
		obj = obj1.stream();
		obj.forEach(System.out::println);
	}

}
