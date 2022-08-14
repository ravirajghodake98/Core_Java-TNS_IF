package com.cg.stringbuffer;

public class Example3 {

	public static void main(String[] args) {
		String s = "Today";
		StringBuffer sb = new StringBuffer(s.length());
		//You cannot declare capacity for string. capacity will only work with stringBuffer
		System.out.println(sb.capacity());

	}

}