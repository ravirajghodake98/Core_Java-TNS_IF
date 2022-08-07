package com.cg.lamexp;
//functional interface
interface A
{
	//zero parameter abstract method
	void show();
}
/*class B implements A
{

	@Override
	public void show() {
		System.out.println("Program to implement Functional interface using lambda expression");
	} 
	
}*/

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		b.show();
		
		//lambda expression
		A obj = () ->
		{
			System.out.println("Program to implement Functional interface using lambda expression");
		};
		obj.show();
	}

}
