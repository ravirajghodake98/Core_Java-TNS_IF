package com.cg.interfacekeyword;

interface inf
{
	//by default it's abstract method
	void display();
}
class Demo implements inf
{
	//provided the implementation for the abstract method inside the Demo class
	@Override
	public void display()
	{
		System.out.println("Interface");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.display();
	}

}
