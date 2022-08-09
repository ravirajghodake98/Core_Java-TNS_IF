package com.cg.enumeration;

enum Car
{
	Lamborghini, Bugati, Mustang;
}

public class EnumOutsideClass {

	public static void main(String[] args) {
		//we cannot create object for enum
		Car c = Car.Lamborghini;
		System.out.println(c);
	}

}
