package testNgAssignmens;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*Assignment 47: WAP for below annotation and check execution
 				@Test
				@AfterMethod
				@BeforeSuite
				@AfterClass
*/

public class AS47_Test_AfterMethod_BeforeSuite_AfterClass {

	@Test
	public void test() {
		System.out.println("@Test method");
	}

	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}

	@BeforeSuite
	public void bs() {
		System.out.println("@BeforeSuite");
	}

	@AfterClass
	public void ac() {
		System.out.println("@AfterClass ");
	}

}
