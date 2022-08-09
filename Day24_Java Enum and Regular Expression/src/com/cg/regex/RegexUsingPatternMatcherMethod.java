package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUsingPatternMatcherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("Programming");
		Matcher m = p.matcher("Java Programming is sufficient to get job in IT industry");
		while(m.find())
		{
			System.out.println("Pattern found from: " +m.start()+ " to " +(m.end()-1));
		}
//		System.out.println("No such word found");
	}

}
