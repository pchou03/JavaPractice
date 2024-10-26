package testNgAssignmens;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Assignment 49: WAP for below annotation and check execution
				@BeforeMethod
				@Test1
				@Test2
				@AfterMethod
*/

public class AS49_BeforeMethod_Test1_Test2_AfterMethod 
{
	@BeforeMethod 
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test 
	public void test1()
	{
		System.out.println("@Test1 method");
	}
	
	@Test 
	public void test2()
	{
		System.out.println("@Test2 method");
	}
	
	@AfterMethod 
	public void am()
	{
		System.out.println("@AfterMethod");
		System.out.println();
	}	
	
}
