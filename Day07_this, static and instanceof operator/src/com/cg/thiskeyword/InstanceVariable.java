package com.cg.thiskeyword;
//1. this keyword is used to refer the instance variable of current class
class Fruit
{
	private String str;
	private String str1;
	void accept(String str, String str1)
//	void accept(String str2, String str3)
	{
//		str = str2;
//		str1 = str3;
		this.str = str;
		this.str1 = str1;
	}
	void display()
	{
		System.out.println("The first string is: " +str);
		System.out.println("The second string is: " +str1);
	}
}

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		f.accept("Raviraj", "Starlord");
		f.display();
	}

}
