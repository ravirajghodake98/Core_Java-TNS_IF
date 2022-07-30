package com.cg.superkeyword;
//Super keyword - it is used to invoke parent class constructor
class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
}

class Rose extends Flower
{
	Rose()
	{
		// invoking parent class constructor
		//first give the preference to call constructor and then print the statement
		super();
		System.out.println("Rose is Red");
	}
}

class Lotus extends Flower
{
	Lotus()
	{
		super();
		System.out.println("Lotus");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Rose r = new Rose();
		@SuppressWarnings("unused")
		Lotus l = new Lotus();
	}

}
