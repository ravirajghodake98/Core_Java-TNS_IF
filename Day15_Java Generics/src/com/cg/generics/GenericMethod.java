package com.cg.generics;

public class GenericMethod {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5};
		Character ch[]= {'a','b','c','d','e'};
		
		System.out.println("Integer array: ");
		print(arr);
		
		System.out.println("Character array: ");
		print(ch);
	}
		
		// Generic method: we can pass any type of arguments
		// E is a element here
		public static <E> void print(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.print(elem);
			}
			System.out.println();
		}
}