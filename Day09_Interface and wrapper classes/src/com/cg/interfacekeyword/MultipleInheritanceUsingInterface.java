package com.cg.interfacekeyword;
//Multiple Inheritance	
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class Son implements Mother, Father
{

	@Override
	public void print() {
		System.out.println("My father name is Dashrath");
	}

	@Override
	public void display() {
		System.out.println("My mother name is Asha");
	}
	
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Son s = new Son();
		s.display();
		s.print();
	}

}
