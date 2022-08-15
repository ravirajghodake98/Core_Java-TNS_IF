package com.cg.vector;
import java.util.*;

public class VectorClass 
{
	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<Object>();
//		v.add(11);
//		v.add("Ravi");
//		v.add(20.55f);
		v.add(0,"Raviraj");
		v.add(1,"R");
		v.add(2,45);
		System.out.println(v); 
		System.out.println(v.set(1, 'S'));
		System.out.println(v);
		//copying all the elements of vector into arrayList using addAll method
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);    //using addAll method you can add or delete elements
		System.out.println(a); 
		a.clear();
		System.out.println(a); 	
	}
}