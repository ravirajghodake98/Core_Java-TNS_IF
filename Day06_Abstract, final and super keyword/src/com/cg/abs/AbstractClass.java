package com.cg.abs;
// program for abstract class
abstract class Fruit
{
	abstract void display();	//abstract method
}

class Apple extends Fruit
{
	// provide implementation for abstract method
	void display()
	{
		System.out.println("Apple is good for health");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// we cannot create the object for abstract class
		// Fruit f = new Fruit();
		Fruit f = new Apple();
//		Apple f = new Apple();
		f.display();
	}

}
