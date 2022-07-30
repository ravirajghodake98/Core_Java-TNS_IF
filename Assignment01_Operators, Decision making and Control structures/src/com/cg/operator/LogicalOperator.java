package com.cg.operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = s.nextInt();
		System.out.print("Enter second integer: ");
		int b = s.nextInt();
		boolean result = a<b && b<11;
		boolean result1 = a<b || b<11;
		boolean result2 = !(a<b);
		System.out.println("Result is: " +result);
		System.out.println("Result is: " +result1);
		System.out.println("Result is: " + result2);
		s.close();
	}

}