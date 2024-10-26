package testNgAssignmens;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Assignment 63: Write a script on  timeOut parameter in TestNG

public class AS63_TimeOutTestNG {

	@Test(timeOut = 1000)
	public void launchBrowser() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// will get TimeOut exeception ->
		// org.testng.internal.thread.ThreadTimeoutException
	}

	@Test
	public void test() {
		System.out.println("Test without timeOut");
	}

}
