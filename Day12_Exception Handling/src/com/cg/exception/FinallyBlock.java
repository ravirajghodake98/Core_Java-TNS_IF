package com.cg.exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in a try block that exception will handle by catch block
		try
		{
			int res= 15/x;
			System.out.println(res);
			//finally block will not executes if you call below statement
			System.exit(0);
		}
		catch(Exception e)   //e is a  variable
		{
			//System.out.println(e);
			System.out.println("Exception Handle");
		}
		finally
		{
			System.out.println("Whether any exception occur or not the finally block is always executed");
		}
		System.out.println("Line outside try, catch and finally block");    // any line outside try, catch and finally, it will print 
	}

}