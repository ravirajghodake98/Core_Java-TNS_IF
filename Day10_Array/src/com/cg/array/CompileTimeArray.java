package com.cg.array;

public class CompileTimeArray {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		//System.out.println(arr[3]);    to print the particular position value of array
		
		//to print complete array
	/*	for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}*/
		
		//to print complete array using enhanced for loop
		for(int x:arr)
		{
			System.out.println(x);
		}

	}

}