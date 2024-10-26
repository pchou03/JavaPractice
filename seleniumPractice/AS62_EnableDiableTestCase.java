package testNgAssignmens;

import org.testng.annotations.Test;

//Assignment 62: Write a script to disable any Testcase in TestNG

public class AS62_EnableDiableTestCase 
{	
	@Test(enabled = false)
	public void testcase1()
	{
		System.out.println("test invocation count");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("testcase2");
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("testcase3");
	}

}
