package com.cg.lamexp;

interface D
{
	int add(int a, int b);
}

public class LambdaExpressionWithoutReturnType {

	public static void main(String[] args) {
		// lambda expression without returning a value
		D obj = (int a, int b) -> (a+b);
		System.out.println("Addition of a and b is: " + obj.add(6857, 651));
	}

}
