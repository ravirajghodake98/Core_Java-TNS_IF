package com.cg.strings;

import java.util.Scanner;

public class StringCompareUserInput {

	public static void main(String[] args) {
	    String str= "Dhoni";
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter string: ");
	    String str1=s.nextLine();
	    if(str.equals(str1))
	    {
	    	System.out.println("Two string macthes");
	    }
	    else
	    {
	    	System.out.println("Does not match");
	    }
        s.close();
	}

}