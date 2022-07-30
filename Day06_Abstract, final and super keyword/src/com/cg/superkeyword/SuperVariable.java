package com.cg.superkeyword;
//Super keyword - it is used to access parent class instance variable
class Mobile
{
	protected String name = "Redmi";
}

class Redmi extends Mobile
{
	String name = "Note10";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Redmi r = new Redmi();
		r.display();
	}

}
