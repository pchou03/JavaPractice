package testNgAssignmens;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Assignment 51: WAP for below annotation and check execution
				@BeforeMethod
				@Test1
				@Test2
*/

public class AS51_BeforeMethod_Test1_Test2 {

	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void test1() {
		System.out.println("@Test1 method \n");
	}

	@Test
	public void test2() {
		System.out.println("@Test2 method\n");
	}

}
