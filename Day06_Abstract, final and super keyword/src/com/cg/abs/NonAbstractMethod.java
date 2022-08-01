package com.cg.abs;

abstract class A
{
	void print()
	{
		System.out.println("Non Abstract Method");
	}
}

class B extends A
{
	/*void display()
	{
		System.out.println("Child class-B");
		super.print();
	}	*/
	//As B is inheriting the properties of A class, then it has print method
}

public class NonAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new B();
//		a.print();
		B a = new B();
		a.print();
//		a.display();
	}

}
