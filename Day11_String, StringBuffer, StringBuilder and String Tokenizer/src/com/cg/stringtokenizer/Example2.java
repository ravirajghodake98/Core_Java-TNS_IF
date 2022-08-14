package com.cg.stringtokenizer;

import java.util.StringTokenizer;

public class Example2 {

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("Lets try this");
		StringTokenizer st2 = new StringTokenizer("Let,s,try,this",",");
		StringTokenizer st3 =new StringTokenizer("JAVA:Code:String", ":", true);
		StringTokenizer st4 =new StringTokenizer("JAVA:Code:String", ":", false);
				while(st1.hasMoreTokens()) {      //it will give all the tokens
				System.out.println(st1.nextToken());
				}
				while(st2.hasMoreTokens()) {      //it will give all the tokens
					System.out.println(st2.nextToken());
					}
				while(st3.hasMoreTokens()) {      //it will give all the tokens
					System.out.println(st3.nextToken());
					}
				while(st4.hasMoreTokens()) {      //it will give all the tokens
					System.out.println(st4.nextToken());
					}

	}

}