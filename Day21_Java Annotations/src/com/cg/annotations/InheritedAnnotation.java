package com.cg.annotations;

import java.lang.annotation.*;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//if we need to inherit an annotation from superclass, then go with inherited annotation
@Inherited
//custom annotation
@interface CustomA
{
	String print();
}
class D
{
	@CustomA(print = "Raviraj")
	public void display()
	{
		System.out.println("Displaying Inherited");
	}
}
class E extends D
{
	public void display1()
	{
		System.out.println("Displaying Inherited-11");
	}
}

public class InheritedAnnotation {

	public static void main(String[] args) throws NoSuchMethodException {
		// TODO Auto-generated method stub
		E e = new E();
		e.display();
		e.display1();
		
		Method m = e.getClass().getMethod("display");
		CustomA obj = m.getAnnotation(CustomA.class);
		System.out.println(obj.print());
	}

}
