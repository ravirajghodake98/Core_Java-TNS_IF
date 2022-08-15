package com.cg.vector;
import java.util.*;
 
public class StackProgram 
{
	public static void main(String[] args) 
	{
		Stack<Object> s=new Stack<Object>();
		//push method is used to add the elements into the stack
		//NOTE: we can also use add method to add elements in the stack
		//add can be used anywhere but push and pop concept can only be used in stack
		s.push(11);
		s.push(12);
		s.push("Neha");
		System.out.println(s); 
		//pop is used to remove the elements into the stack
		s.pop();
		System.out.println(s); 
	}
}