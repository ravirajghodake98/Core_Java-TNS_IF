package com.cg.para;

import java.util.Scanner;

class C
{
	int rollno;
	String name;
	int rollno1;
	String name1;
	C(int r, String n)
	{
		rollno = r;
		name = n;
		rollno1 = r;
		name1 = n;
	}
	void print()
	{
		System.out.println("Roll no is: "+rollno +" and Name is: "+name);
	}
}

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the rollno and name ");
		int rollno = s.nextInt();
		String name = s.nextLine();
		System.out.println("Enter the rollno1 and name1 ");
		int rollno1 = s.nextInt();
		String name1 = s.nextLine();
		C obj = new C(rollno, name);
		C obj1 = new C(rollno1, name1);
		obj.print();
		obj1.print();
		s.close();
	}

}