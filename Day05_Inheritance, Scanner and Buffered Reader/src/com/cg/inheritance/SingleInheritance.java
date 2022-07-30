package com.cg.inheritance;

class Bike
{
	public int speed = 120;
	void speed()
	{
		System.out.println("The speed of bike is: " +speed +"km/hr");
	}
}

class Ninja extends Bike
{
	void model()
	{
		System.out.println("ZX-10R");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Ninja n = new Ninja();
		n.speed();
		n.model();

	}

}