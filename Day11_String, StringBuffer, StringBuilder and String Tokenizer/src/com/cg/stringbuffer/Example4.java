package com.cg.stringbuffer;

public class Example4 {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("Internet of things");
		System.out.println(buff.capacity());
		buff = new StringBuffer(" ");
		System.out.println(buff.capacity());
	}

}