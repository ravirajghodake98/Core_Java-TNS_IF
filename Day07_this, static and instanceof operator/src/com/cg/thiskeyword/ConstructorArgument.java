package com.cg.thiskeyword;
//2. this keyword can be passed as an argument in constructor call
class A
{
	public int a;
	/*A();
	{
		
	}*/
	A(int a)
	{
		this.a = a;
	}
}
public class ConstructorArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A(5);
		System.out.println("The value of a is: " +obj.a);
	}

}
