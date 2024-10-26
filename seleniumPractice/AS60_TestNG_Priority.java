package testNgAssignmens;

import org.testng.annotations.Test;

//Assignment 60: Write a script to run 3 @Test, with priority parameter.Observe the order of execution.

public class AS60_TestNG_Priority 
{
	//default priority
	@Test
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=1)
	public void logout()
	{
		System.out.println("logout\n");
	}
	@Test(priority=-1)
	public void registartion()
	{
		System.out.println("\n registartion");
	}
	
	
}