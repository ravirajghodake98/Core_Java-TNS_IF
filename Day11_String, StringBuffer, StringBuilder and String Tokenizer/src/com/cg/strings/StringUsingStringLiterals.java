package com.cg.strings;

import java.util.Scanner;

//program on string using string literals
public class StringUsingStringLiterals {

	public static void main(String[] args) {
		//this is with the help of compile time input
//		String str="Hello world";
//		System.out.println(str);
		
		
		//this is with the help of run time input
		Scanner s= new Scanner(System.in);
		String str1=s.next();
		System.out.println(str1);
		s.close();
		
	}

}