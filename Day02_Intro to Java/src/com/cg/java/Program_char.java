package com.cg.java;

import java.util.Scanner;

public class Program_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
		System.out.println("The character at 0th position is: " +ch);			
		in.close();
	}

}