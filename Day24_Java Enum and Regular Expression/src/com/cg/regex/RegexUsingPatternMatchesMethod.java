package com.cg.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUsingPatternMatchesMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "Raviraj Ghodake";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = s.nextLine();
		boolean result = Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();
	}

}
