package com.cg.decision_making;

import java.util.Scanner;

public class Nested__if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		System.out.print("Enter your weight: ");
		int weight = s.nextInt();
		s.close();
		if (age >= 12)
		{
			if (weight >= 40)
			{
				if (weight <= 110)
				{
					System.out.print("Eligible for bungee jumping");
				}
				else
				{
					System.out.print("Extra ropes will be added");
				}
			}
			else {
				System.out.print("Not eligible for bungee jumping");
			}
		}
		else {
			System.out.print("Not eligible for bungee jumping");
		}
	}

}