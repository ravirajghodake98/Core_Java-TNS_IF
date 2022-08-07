package com.cg.annotations;
//@Override annotation is giving the extra information about the method
class Car
{
	void speed(int s)
	{
		System.out.println("speed is: " +s +"kmph");
	}
}
class Audi extends Car
{
	@Override
	void speed(int str)
	{
		System.out.println("speed is: " +str +"kmph");
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a = new Audi();
		a.speed(100);
	}

}
