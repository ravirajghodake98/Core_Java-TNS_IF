package com.cg.inheritance;

class MobileBrand
{
	void displayName()
	{
		System.out.println("Brand is: Redmi");
	}
}

class RedmiNote10 extends MobileBrand
{
	void display()
	{
		System.out.println("Redmi Note 10");
	}
}

class RedmiNote10Pro extends MobileBrand
{
	void display1()
	{
		System.out.println("Redmi Note 10 Pro");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		RedmiNote10Pro r = new RedmiNote10Pro();
		r.display1();
		r.displayName();
		
		RedmiNote10 r1 = new RedmiNote10();
		r1.display();
	}

}