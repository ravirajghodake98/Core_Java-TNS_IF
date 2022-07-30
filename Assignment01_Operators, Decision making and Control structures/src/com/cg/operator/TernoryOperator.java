package com.cg.operator;

import java.util.Scanner;

public class TernoryOperator {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = s.nextInt();
		System.out.print("Enter second integer: ");
		int b = s.nextInt();
		int result = (a%b == 0)?1:0;
		System.out.print("Result is: " + result);
		s.close();
	}

}