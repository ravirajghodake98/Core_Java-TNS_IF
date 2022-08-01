package com.cg.thiskeyword;
//5. this can be used to invoke or initiate current class constructor
class X
{
	int a;
	X()
	{
		this(10);
		System.out.println("Inside default Constructor");
	}
	X(int a)
	{
		this.a = a;
		System.out.println("Inside Parametrized Constructor");
		System.out.println("Value of a is: " +a);
	}
}

public class InvokeCurrentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X a = new X();
		//as in object we are not passing any parameter/argument that why it will call X(). But as this(10) has a parameter so it will jump to
		//A(int a) as its a parameterized constructor	
	}

}
