package com.cg.decision_making;

import java.util.Scanner;

public class Cascaded_if__else {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = s.nextInt();
		System.out.print("Enter second integer: ");
		int b = s.nextInt();
		System.out.print("Enter third integer: ");
		int c = s.nextInt();
		if (a>b && a>c) {
			System.out.println("The value of a is: " +a);
		}
		else if (b>a && b>c) {
			System.out.println("The value of b is: " +b);
		}
		else {
			System.out.println("The value of c is: " +c);
		}
		s.close();
	}

}