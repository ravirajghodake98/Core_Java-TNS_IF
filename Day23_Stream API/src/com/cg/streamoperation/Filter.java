package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Float>obj = Arrays.asList(24.3f, 58.6f, 38.5f);
		System.out.println(obj);
		//filtering with condition: filter(predicate)
		//forEach is used to extract the values
		obj.stream().filter(i -> i>26.3f).forEach(System.out::println);
	}

}
