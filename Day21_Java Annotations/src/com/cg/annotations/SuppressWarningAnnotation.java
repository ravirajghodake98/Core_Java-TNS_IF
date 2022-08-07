package com.cg.annotations;

class Animal
{
	Animal()
	{
		System.out.println("Lion");
	}
	void sound()
	{
		System.out.println("Roars");
	}
}

public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		// will remove the compiler warnings
		@SuppressWarnings("unused")
		Animal a = new Animal();
	}
	
}