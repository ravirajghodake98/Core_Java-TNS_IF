package com.cg.testing;
//programs on Assertions
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FourthUnitTestingProgram 
{
	@Test
	void display()
	{
		int arr[]= {1,2,3,4,5};
		assertAll("arr",()->assertEquals(arr[0],1),   //assertEquals method will check if the value provided at given index will match or not
		//arr[0]=1 | 1==1 | true
		//as in zero index of arr we have 1 so it will run without error
		//if we pass arr[0],2 then it will show error in JUnit console
				()->assertEquals(arr[3],4));  //arr[3]=4 | 3==4 | false (it will show error in JUnit console
	}
}