package testNgAssignmens;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Assignment 44: WAP with all 9 TestNG annotations and check the order of execution

public class AS44_TestNG_AllAnnotation {

	@Test
	public void testCase1() {
		System.out.println("TestCase1");
	}

	@Test
	public void testCase2() {
		System.out.println("TestCase1");
	}

	@BeforeSuite
	public void bs() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void bt() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void bc() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void ac() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void at() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void as() {
		System.out.println("AfterSuite");
	}
}
