package com.cg.decision_making;

import java.util.Scanner;

public class Switch__case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Amar");
			break;
		case 'b':
			System.out.println("Akbar");
			break;
		case 'c':
			System.out.println("Anthony");
			break;
		default:
			System.out.println("Invalid input");
		s.close();
		}
	}

}