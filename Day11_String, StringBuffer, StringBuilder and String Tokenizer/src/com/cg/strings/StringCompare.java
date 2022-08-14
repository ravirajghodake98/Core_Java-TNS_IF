package com.cg.strings;

public class StringCompare {

	public static void main(String[] args) {
		
		//when using both string literals
//		String str= "Hello";
//		String str1="Hello";
//		System.out.println(str==str1);
//		System.out.println(str.equals(str1));
		
		//when creating both string using new keyword
//		String str=new String("Hello");
//		String str1=new String("Hello");
//		System.out.println(str==str1);
//		System.out.println(str.equals(str1));
		
		
		//when using different method
		String str= "Hello";
		String str1=new String("Hello");
		System.out.println(str==str1);
		System.out.println(str.equals(str1));

	}

}