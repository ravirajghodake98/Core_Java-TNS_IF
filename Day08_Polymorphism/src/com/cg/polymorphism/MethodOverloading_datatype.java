package com.cg.polymorphism;
//program on method overloading:- in terms of changing data-types
class A
{
	//having different types of arguments
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	void add (float a, float b)
	{
		System.out.println(a+b);
	}
}

public class MethodOverloading_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.add(65, 635);
		obj.add(631.3f, 6451f);
	}

}
