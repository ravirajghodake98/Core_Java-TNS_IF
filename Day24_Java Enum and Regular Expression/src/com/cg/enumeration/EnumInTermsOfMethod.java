package com.cg.enumeration;

interface Pizza
{
	void display();
}
enum size implements Pizza
{
	regular, medium, large;

	@Override
	public void display() {
		System.out.println("Size is: " +this);
	}
}

public class EnumInTermsOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size.medium.display();
	}

}
