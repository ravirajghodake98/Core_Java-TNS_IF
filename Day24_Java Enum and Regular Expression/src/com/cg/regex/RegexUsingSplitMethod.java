package com.cg.regex;

import java.util.Scanner;

public class RegexUsingSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = "M-21 ##Raviraj##Shabnam##Mahendra##Parag##Priyanka";
		String[] res = str.split("##");
		for(String i:res)
		{
			System.out.println(i);	
		}
		s.close();
	}

}
