package com.cg.looping;

import java.util.Scanner;

public class Example_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = s.nextInt();
		for (int i=1; i<=n; i++)
		{
			System.out.print(i + " ");
			s.close();
		}
	}

}