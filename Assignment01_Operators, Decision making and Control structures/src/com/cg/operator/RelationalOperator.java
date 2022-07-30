package com.cg.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = s.nextInt();
		System.out.print("Enter second integer: ");
		int b = s.nextInt();
		boolean res = (a >= b);
		System.out.println("Result is: " +res);
		s.close();
	}

}