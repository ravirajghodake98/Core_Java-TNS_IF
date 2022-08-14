package com.cg.stringbuffer;
//setChar keyword
public class Example6 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Jeva");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1, 'a');
		System.out.println(sb);
		System.out.println(sb.charAt(1));

	}

}