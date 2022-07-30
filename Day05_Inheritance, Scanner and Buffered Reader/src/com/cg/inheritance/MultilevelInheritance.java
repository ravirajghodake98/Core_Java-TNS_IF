package com.cg.inheritance;

class Car
{
	void carType()
	{
		System.out.println("Petrol Engine");
	}
}

class Lamborghini extends Car
{
	public String brand = "Lamborghini";
	void brand()
	{
		System.out.println("The Brand is: " +brand);
	}
}

class Aventador extends Lamborghini
{
	public int speed = 217;
	void top_speed()
	{
		System.out.println("The top speed is: " +speed +" miles/hr");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		Aventador a = new Aventador();
		a.top_speed();
		a.brand();
		a.carType();
	}

}