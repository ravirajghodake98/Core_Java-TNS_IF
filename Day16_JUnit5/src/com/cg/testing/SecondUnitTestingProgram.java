package com.cg.testing;
import org.junit.jupiter.api.*;

public class SecondUnitTestingProgram 
{
	//@BeforeAll: Annotated methods runs before all test methods in the current class
	//@AfterAll: Annotated methods runs after all test methods in the current class
	//@BeforeEach: Annotated methods runs before each test methods
	//@AfterEach: Annotated methods runs after each test methods
	//@Disable: Disables a test class or a method
	//@Tag: We can tag the tests methods like Smoke, Regression, Critical etc
	//@Nested: Annotated class is nested, non-static test class
	//@DisplayName: We can declare a custom display name for a class or a test method
	//@ExtendWith: It is used to register custom extensions
	//@TestFactory: Declares that the method that is  a test factory method for dynamic testing
	
	@Test
	@BeforeAll
	static void display()  //when we are using before all, we have to make that method as static; otherwise we will get error
	{
		System.out.println("@BeforeAll: executes once before all test methods in this class");
	}
	
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("@BeforeEach:executes before each test methods");
	}
	
	@Test
	void print()
	{
		System.out.println("Hi Guys");
	}

}