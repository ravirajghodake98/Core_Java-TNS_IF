package com.cg.recursion;

import java.util.Scanner;

public class Fibonacci {
	static int fibonacci(int n)
	{
		if(n==0)
			return (0);
		else if(n==1)
			return(1);
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n= s.nextInt();
		System.out.println("The term in fibonacci series is: " +fibonacci(n)); // function calling
		s.close();	
	}

}
