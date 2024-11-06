package testNgAssignmens;

import org.testng.annotations.Test;

//Assignment 70: WAP for test Case grouping - Add 5 test cases. 
//				 create groups and Include 3 testcases and exclude 1 test case

public class AS70_TestNg_Grouping {

	@Test(groups = {"integration"})
	public void test1() {

	}

	@Test(groups = {"system"})
	public void test2() {
	}

	@Test(groups = {"system" , "smoke"})
	public void test3() {

	}

	@Test(groups = {"system"})
	public void test4() {

	}

	@Test(groups = {"integration"})
	public void test5() {

	}
}
