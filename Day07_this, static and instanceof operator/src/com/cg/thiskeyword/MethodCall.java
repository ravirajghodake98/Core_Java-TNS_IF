package com.cg.thiskeyword;
//3. this keyword can be passed as an argument in method call
class B
{
	void print(B b)
	{
		System.out.println("Function1 is invoked");
	}
	void display()
	{
		print(this);
	}
}

public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();
	}

}