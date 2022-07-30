package com.cg.superkeyword;
//we can access super method inside abstract class
abstract class A
{
	void print()
	{
		System.out.println("Non-abstract method");
	}
}
class B extends A
{
	void display()
	{
		super.print();
		System.out.println("Child class B");
	}
	
}
public class SuperInNonAbstractClass 
{
	public static void main(String[] args)
	{		
	B a=new B();
	a.display();
	}
}