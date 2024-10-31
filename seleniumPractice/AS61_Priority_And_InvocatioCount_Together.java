package testNgAssignmens;

import org.testng.annotations.Test;

// Assignment 61: Write a script to pass two parameters in @Test

public class AS61_Priority_And_InvocatioCount_Together {

	@Test(priority = 0, invocationCount = 10)
	public void testcase1() {
		System.out.println("test priority and invocation count");
	}

	@Test(enabled = true, invocationCount = 2)
	public void testcase2() {
		System.out.println("test enable and invocation count");
	}

	@Test(priority = 1)
	public void testcase3() {
		System.out.println("test priority");
	}

	@Test(invocationCount = 2)
	public void testcase4() {
		System.out.println("test invocation count");
	}

}
