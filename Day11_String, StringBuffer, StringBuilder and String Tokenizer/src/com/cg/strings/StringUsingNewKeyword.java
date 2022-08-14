package com.cg.strings;

import java.util.Scanner;

//Program to create string using new keyword
public class StringUsingNewKeyword {

	public static void main(String[] args) {
		//this is with the help of compile time input
//		String str= new String("Hello everyone");
//		System.out.println(str);
		
		//this is with the help of run time input
		Scanner s= new Scanner(System.in);
		String str1=new String(s.nextLine());
		System.out.println(str1);
		s.close();

	}

}