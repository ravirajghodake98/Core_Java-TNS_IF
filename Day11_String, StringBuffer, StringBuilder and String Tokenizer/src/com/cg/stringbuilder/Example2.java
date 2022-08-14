package com.cg.stringbuilder;

public class Example2 {

	public static void main(String[] args) {
		String s = "Tomorrow";
		StringBuilder sb = new StringBuilder(s.length());
		System.out.println(sb.capacity());

	}

}