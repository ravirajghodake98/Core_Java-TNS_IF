package com.cg.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

//if you mention @Documented annotation to any interface, it will be called as public contract
//it is a marker interface that tells a tool that an annotation is to be documented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//custom annotation
@interface Custom
{
	//abstract method
	//multi-value annotation:- because it contains more than one method
	String print() default "Raviraj";
	int speed() default 60;
	float percentage() default 68.5f;
}
class B
{
	@Custom (print = "Hello world", speed = 100, percentage = 57.3f)
	public void display()
	{
		System.out.println("It's holiday");
	}
}

public class CustomAnnotation {
	
	public static void main(String[] args) throws NoSuchMethodException {
		B b = new B();
		b.display();
		Method m = b.getClass().getMethod("display");
		Custom obj = m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());
	}
}