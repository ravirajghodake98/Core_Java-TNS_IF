package com.cg.recursion;

import java.util.Scanner;

public class SumOfDigits {
	

	static int submission(int n,int sum)
	{
		if(n==0)
		{
			return (sum++);
		}
		else
		{
			sum+=n%10;
			return submission(n/10,sum);
		}
	}
		
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n= s.nextInt();
		System.out.println("Sum of digits is: " +submission(n,0)); // function calling
		s.close();
		

	}

}