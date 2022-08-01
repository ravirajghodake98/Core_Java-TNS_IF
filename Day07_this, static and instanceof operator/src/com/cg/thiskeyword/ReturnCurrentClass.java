package com.cg.thiskeyword;
//4. this can be used to return current class instance
class Car
{
	int a;
	int b;
	Car()
	{
		a = 10;
		b = 20;
	}
	// method that returns current class instance
	Car get()
	{
		return this;
	}
	//displaying value of variables a and b
	void display()
	{
		System.out.println("The addition of a and b is: " + (a+b));
	}
}

public class ReturnCurrentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		obj.get().display();
	}

}