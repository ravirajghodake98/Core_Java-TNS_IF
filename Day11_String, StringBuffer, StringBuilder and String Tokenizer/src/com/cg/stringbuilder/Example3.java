package com.cg.stringbuilder;

public class Example3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hive");
		//here also we are getting 16 answer because in string builder,
		//if capacity of newly added string is less than previous empty string,
		//then it will print capacity of empty string.
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language"); //(16*2)+2=34
		System.out.println(sb.capacity());
		sb.append("best");                         //(34*2)+2=70
		System.out.println(sb.capacity());
//here formula is used to get capacity for stringBuilder.  Formula=(old capacity*2)+2
	}

}