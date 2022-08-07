package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		//we are using new operator to allocate the memory for our string
		List<Integer>obj1 = Arrays.asList(new Integer[] {5,335,21,3,2,645,-3,-68,45});
//		List<Integer>obj1 = Arrays.asList(5,335,21,3,2,645,-3,-68,45);
		Optional<Integer>obj2 = obj1.stream().filter((i) -> i>5).reduce((a,b) -> a>b?a:b);
		if(obj2.isPresent())
		{
			//get method: if a value is present, returns value otherwise throws exception
			System.out.println("Result is: " + obj2.get());
		}
	}

}
