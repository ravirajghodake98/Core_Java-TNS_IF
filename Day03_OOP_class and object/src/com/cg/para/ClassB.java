package com.cg.para;

class B
{
//	public int x;
//	parametrized constructor
	B(int a)
	{
		System.out.println("The value of a is: " +a);
	}
}

public class ClassB {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(10);
	}

}