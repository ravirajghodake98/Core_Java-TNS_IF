package com.cg.lamexp;

interface C
{
	//two parameterized abstract method
	String print(String p, String q);
}

public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C obj = (String a, String b) -> (a+b);
		
		C obj = (String p, String q) ->
		{
			return p+q;
		};
		System.out.println(obj.print("Raviraj", " Ghodake"));
	}

}
