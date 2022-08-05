package com.cg.polymorphism;
//program on method overloading:- in terms of arguments
class Shape
{
	//by changing the number of arguments
	int area(int a)
	{
		return a*a;
	}
	int area(int a, int b)
	{
		return a*b;
	}
}

public class MethodOverloading_arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
//		s.area(7);
//		s.area(15, 25);
		System.out.println(s.area(7));
		System.out.println(s.area(15, 25));
	}

}
