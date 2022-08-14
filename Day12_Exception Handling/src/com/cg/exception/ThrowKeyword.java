package com.cg.exception;
//program on throw keyword
//throw keyword is used to throw an exception explicitly
public class ThrowKeyword 
{
	public static void validate(int age)
	{
		if (age<21||age>27)
			throw new ArithmeticException("Not Eligible");
		else
			System.out.println("Eligible");
	}

	public static void main(String[] args) {
		try
		{
			validate(36);     //func call
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");

	}

}