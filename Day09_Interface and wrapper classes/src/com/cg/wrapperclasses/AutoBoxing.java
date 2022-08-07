package com.cg.wrapperclasses;
//Autoboxing: converting primitive types to it's respective wrapper class objects
public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 21.6f;	//primitive type
		Float y = x;		//converting primitive to wrapper class
		Float f = new Float(65);
		System.out.println(x+" "+y+" "+f);
	}

}
