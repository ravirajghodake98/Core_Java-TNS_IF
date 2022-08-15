package com.cg.generics;
//GenericClass is a concept that will show you which type of element it is(or which type of class it is)
public class GenericClass <T>
{
	//int num;   /how we use to write data type and variable name, same in T num
	T num;   //here T belongs to any data types (string, integer, float etc)
	        //here num is our type object. num is a variable of type T class
	public void display()
	{
		System.out.println(num.getClass().getName());
	}
	public static void main(String[] args) {
		GenericClass<Integer> obj= new GenericClass<Integer> ();   //Generic advantage
		obj.num= 16;
		obj.display();
	}
}