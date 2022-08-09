package com.cg.enumeration;

public class EnumInsideClass {
	enum Margin
	{
		Top, Bottom, Left, Right;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for (Margin m: Margin.values())
		{
			//%d and %s are format specifier so that's why we use printf
			System.out.printf("Margin%d : %s\n", count++, m);
		}
	}

}
