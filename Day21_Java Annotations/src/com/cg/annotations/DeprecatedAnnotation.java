package com.cg.annotations;

class A
{
	//it allows any elements no longer to be used
	//if we want to use any method for temporary purpose
	@Deprecated
	public void print()
	{
		System.out.println("Hello, world");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.print();
	}

}
