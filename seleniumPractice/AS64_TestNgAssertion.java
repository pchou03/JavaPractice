package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Assignment 64: WAP for Launch amazon, search for shoe and verify whether test is pass/fai

public class AS64_TestNgAssertion {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		// Set up WebDriver
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void testNgAssertion() throws InterruptedException {

		WebElement searchTextBox = driver.findElement(By.xpath("(//input)[5]"));
		// imp: use parenthesis while using indexing otherwise xpath will not work in
		// future
		searchTextBox.sendKeys("shoes" + Keys.ENTER);
		// searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String pageTitle = driver.getTitle().toLowerCase();
		Assert.assertEquals("amazon.in : shoes", pageTitle, "Title didnt match test fail");
		Assert.assertTrue(pageTitle.contains("shoe"), "Test Failed: 'Shoe' not found in page title.");
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}
}
