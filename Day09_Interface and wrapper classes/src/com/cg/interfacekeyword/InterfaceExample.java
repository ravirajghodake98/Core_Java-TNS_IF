package com.cg.interfacekeyword;

public interface InterfaceExample {
	void display();
}
class X implements InterfaceExample
{
	//provide the implementation for abstract method inside the X class
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceExample");
	}
	
}
