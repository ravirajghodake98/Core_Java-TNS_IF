package com.cg.polymorphism;
//program on method overriding
//one class is not enough; create at least two classes which contains inheritance concept
class Multiplication
{
	void accept (int a, int b)
	{
		System.out.println(a*b);
	}
}

class Multiply extends Multiplication
{
	void accept (int x, int y)
	{
		System.out.println(x*y);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply m = new Multiply();
		m.accept(54, 56);
		Multiplication m1 = new Multiplication();
		m1.accept(4, 365);
	}

}
