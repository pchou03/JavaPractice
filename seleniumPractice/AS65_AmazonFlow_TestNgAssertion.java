package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Assignment 65: WAP for Login  amazon, search for product and logout 
//				 and verify whether test is pass/fail

public class AS65_AmazonFlow_TestNgAssertion {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void AmazonTestFlow() throws InterruptedException {
		amazonLogin();
		serachProduct();
		signout();

		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Amazon Sign In", "Test Fail Title not match");
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}

	public void hoverOver() {
		WebElement hoverOverSignIn = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

		Actions action = new Actions(driver);
		action.moveToElement(hoverOverSignIn).perform();
	}

	public void amazonLogin() {

		hoverOver();

		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		signInLink.click();

		WebElement emailPhone = driver.findElement(By.id("ap_email"));
		emailPhone.sendKeys("9527106034");

		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Prashant@123");

		WebElement signInButton = driver.findElement(By.id("auth-signin-button"));
		signInButton.click();
	}

	public void serachProduct() {

		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("shoes" + Keys.ENTER);

	}

	public void signout() throws InterruptedException {

		hoverOver();

		WebElement signOut = driver.findElement(By.linkText("Sign Out"));
		signOut.click();
		Thread.sleep(3000);
	}

	
}
