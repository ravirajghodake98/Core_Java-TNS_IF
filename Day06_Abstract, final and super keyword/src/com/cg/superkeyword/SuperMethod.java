package com.cg.superkeyword;
//Super keyword - it is used to access parent class instance variable
class Animal
{
	public int a=10, b=20;
	public void display()
	{
		System.out.println("The addition of a and b is: " +(a+b));
	}
}

class Tiger extends Animal
{
	public void display()
	{
		System.out.println("Tiger");
	}
	void print()
	{
		display();
		super.display();
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		//accessing the parent class method using super keyword
		Tiger t = new Tiger();
		t.print();
	}

}
