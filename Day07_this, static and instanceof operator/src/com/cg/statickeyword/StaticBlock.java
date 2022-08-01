package com.cg.statickeyword;

public class StaticBlock {
	static int num;
	static String str;
	//static block: if you want to initialize the value w/o using the constructor and obj.creation,
	//then use static block
	static
	{
		num = 15;
		str = "Raviraj";
	}
	/*	//constructor
	StaticBlock()	
	{
		num = 15;
		str = "Raviraj";
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticBlock s = new StaticBlock();
//		System.out.println(s.num);
//		System.out.println(s.str);
		System.out.println(num);
		System.out.println(str);
	}

}
