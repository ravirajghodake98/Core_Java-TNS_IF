package com.cg.decision_making;

import java.util.Scanner;

public class If___else {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = s.nextInt();
		System.out.print("Enter second integer: ");
		int b = s.nextInt();
		if (a<b) {
			System.out.println("The value of a is: " +a);
		}
		else {
			System.out.println("The value of b is: " +b);
		}
		s.close();
	}

}