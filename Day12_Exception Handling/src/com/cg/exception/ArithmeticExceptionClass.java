package com.cg.exception;

import java.util.Scanner;

public class ArithmeticExceptionClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in a try block that exception will handle by catch block
		try
		{
			int res= 15/x;
			System.out.println(res);
		}
		catch(Exception e)   //e is a  variable
		{
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		s.close();
	}

}