package com.cg.interfacekeyword;

interface Vehicle
{
	void speed();
}
//when we use two interfaces and we want to access one interface with another interface,
//then always use extends keyword
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}

	@Override
	public void speed() {
		System.out.println("Speed is: 60kmph");
	}
}

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus();
		b.engine();
		b.speed();
	}

}
