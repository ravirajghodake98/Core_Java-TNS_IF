package com.cg.abs;

//final abstract class Car	//we cannot make any abstract class as final in Java
abstract class Car
{
	abstract void display();
}

class Audi extends Car
{
	void display()
	{
		System.out.println("Audi");
	}
}

public class FinalAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi c = new Audi();
		c.display();
	}

}
