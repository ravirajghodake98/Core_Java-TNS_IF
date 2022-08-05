package com.cg.polymorphism;
//program on constructor overloading

class Triber
{
	int speed;
	String engine;
	//zero parameter
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	//two parameter
	Triber(int speed, String engine)
	{
		this.speed = speed;
		this.engine = engine;
		System.out.println("Speed is: " +speed + "kmph and engine is on " + engine);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triber t = new Triber();
		Triber t1 = new Triber(85, "Petrol");
	}

}
