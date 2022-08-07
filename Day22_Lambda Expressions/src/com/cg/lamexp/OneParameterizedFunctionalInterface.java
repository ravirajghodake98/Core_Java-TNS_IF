package com.cg.lamexp;
//Function interface- which contains only one abstract method
interface B
{
	//one parameterized abstract method
	String print(String str);
}

public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//Lambda expression
		B obj = (String str) ->
		{
			return str;
		};
		System.out.println(obj.print("Lambda Expression"));
	}

}
