package com.cg.customexception;

import java.util.Scanner;

//create an own exception
//Checked exception: It is used in compile time where we can recover from exception

@SuppressWarnings("serial")
class NameNotFound extends Exception   //NameNotFound is a user defined exception class name
{
	//constructor
	NameNotFound(String name)
	{
		super(name);
	}
}

public class CustomException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		try
		{
			empname(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
	}
	//declaring an exception
		static void empname(String str) throws NameNotFound
		{
			if(str.isEmpty())
			{
				//throwing an exception explicitly
				throw new NameNotFound("Employee name is Empty");
			}
			else
			{
				System.out.println("Hello "+str+",");
			}
		}

}