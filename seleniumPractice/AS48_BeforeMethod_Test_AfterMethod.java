package testNgAssignmens;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Assignment 48: WAP for below annotation and check execution
				@BeforeMethod
				@Test
				@AfterMethod
*/

public class AS48_BeforeMethod_Test_AfterMethod {

	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void test() {
		System.out.println("@Test method");
	}

	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}
}
