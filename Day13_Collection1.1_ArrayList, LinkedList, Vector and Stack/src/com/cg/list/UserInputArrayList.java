package com.cg.list;
import java.util.*;

public class UserInputArrayList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str);
		// If above 3 lines is not included in this program. we are not getting output in array form
		Scanner token= new Scanner(str);  //it is important to give user token as str only; otherwise  output is not in array form. We are dividing the given input strings into tokens
		token.useDelimiter(" ");   //here delimiter means there is tokens in between spaces. Till one space one token, ten till other space other token  
		//user-input array list
		ArrayList<Object>arr=new ArrayList<Object>();
		//to return the elements  in the array
		while(token.hasNext())
		{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()-1));   //as array index starts from 0, that's why -1
			//this line will give output of array in vertical form as one token in one line
		}
		System.out.println(arr);  //we are getting actual  output in array form here
		token.close();
		s.close();
	}

}