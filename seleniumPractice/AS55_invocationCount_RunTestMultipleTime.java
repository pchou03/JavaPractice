package testNgAssignmens;

import org.testng.annotations.Test;

//Assignment 55: WAP how to run the same test case multiple times with the help of @Test (invocationCount)

public class AS55_invocationCount_RunTestMultipleTime {
	@Test(invocationCount = 10)
	public void testcase1() {
		System.out.println("test invocation count");
	}

	@Test
	public void testcase2() {
		System.out.println("testcase2");
	}

	@Test
	public void testcase3() {
		System.out.println("testcase3");
	}

}
