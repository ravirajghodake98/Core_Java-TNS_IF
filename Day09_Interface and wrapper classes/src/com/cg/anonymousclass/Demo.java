package com.cg.anonymousclass;
//Anonymous class
abstract class Anonymous
{
	public abstract void method();
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous a = new Anonymous()
		{
			public void method()	
			{
				System.out.println("This is an example of an anonymous class");
			}
		};
		a.method(); 
	}

}
