package com.cg.strings;
//Program to find length of string
import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter string: ");
	    String str1=s.nextLine();
	    System.out.println(str1.length());
	    System.out.println(str1.charAt(4));
	    System.out.println(str1.toUpperCase());
	    System.out.println(str1.toLowerCase());
	    
	    //to concatenate string
	    System.out.println(10+20+" Hello"+" "+"World!"+" 10+20"+" "+ 10+20);  //different types of concatenate in one line
	    System.out.print("Enter string 2: ");
	    String str2=s.nextLine();
	    System.out.println(str1.concat(str2));
	    
	    s.close();
	}
	

}