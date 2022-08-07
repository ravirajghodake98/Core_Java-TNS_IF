package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj = Arrays.asList(10, 33, 45, 10, 32, 45, 65, 99);
		//distinct: takes unique values
		obj.stream().distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		//it sets the limit- first n-limit elements
		obj.stream().limit(4).forEach(i -> System.out.print(i + " "));
		System.out.println();
		//sorts the element in ascending order
		obj.stream().sorted().forEach(i -> System.out.print(i + " "));
	}

}
