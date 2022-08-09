package com.cg.enumeration;

public class EnumUsingIfElse {
	enum EmpType
	{
		Contract, Temporary, Permanent
	}
	static void print(EmpType e)
	{
		if(e==EmpType.Permanent)
		{
			System.out.println("Permanent Employee");
		}
		else if(e==EmpType.Contract)
		{
			System.out.println("Contract-based Employee");
		}
		else
		{
			System.out.println("Temporary Employee");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpType e = EmpType.Permanent;
		print(e);
	}

}
