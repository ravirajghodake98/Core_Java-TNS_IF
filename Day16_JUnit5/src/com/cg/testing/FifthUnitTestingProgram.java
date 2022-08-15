package com.cg.testing;

import static org.junit.Assume.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.*;

public class FifthUnitTestingProgram 
{
	//JUnit Jupiter comes with a subset of the assumption methods that JUnit 4 provided an adds a few that lend themselves well to being used with Java 8 Lambdas. They are static methods by default.

	//assumeTrue(Boolean assumption): will evaluate the given assumption and if it results in true then the given test is allowed to execute
	//assumeFalse(Boolean assumption): will evaluate the given assumption and test will run if result is false
	//assumeThat(Boolean assumption, Executable executable): It will evaluate the lambda executable only if given assumption is true.
	
	@Test
	@Disabled
	void trueAssumption()
	{
		assumeTrue(5>1);
		assertEquals(5+2,7); 
	}
	
	@Test
	@Disabled
	void falseAssumption()
	{
		assumeFalse(5<1);
		assertEquals(5+2,7); 
	}
	
	@Test
	void assumtionThat()
	{
		String str="Shabnam";
		assumingThat(str.equals("Shabnam"),
		()-> assertEquals(5+2,7));
	}
}