package com.cg.testing;
import org.junit.jupiter.api.*;

public class ThirdUnitTestingProgram
{
	@DisplayName("Test is successfully implemented")  //we will get this string output given in display name in left hand side JUnit console
	@Test
	void function()
	{
		System.out.println("Want to display a name");
	}
	
	@Test
	@Disabled("Not Implemented")
	void function1()
	{
		System.out.println("Disabled");
	}
}