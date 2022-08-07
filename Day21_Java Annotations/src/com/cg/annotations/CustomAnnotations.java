package com.cg.annotations;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept=54)
	public void display()
	{
		System.out.println("Hey, I am using custom annotations");
	}
}

public class CustomAnnotations {

	public static void main(String[] args) throws NoSuchMethodException {
		// TODO Auto-generated method stub
		C c = new C();
		//to access interface method in line 12, we have to go with Method(in-built) class
		Method m = c.getClass().getMethod("display");
		OwnCustom obj = m.getAnnotation(OwnCustom.class);
		System.out.println(obj.accept());
		c.display();
	}

}
