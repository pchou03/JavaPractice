package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/*Assignment 45: WAP for below annotation and check execution
 				 @Test
 				 @AfterMethod
 				 @AfterClass
*/

public class AS45_Test_AfterMethod_AfterClass {

	static ChromeDriver driver;

	@Test
	public void swagLabsAutomation() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		// login to application
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@AfterMethod
	public void logot() throws InterruptedException {
		// logout from application
		WebElement openMenu = driver.findElement(By.xpath("//button[.='Open Menu']"));
		openMenu.click();
		Thread.sleep(2000);
		WebElement logoutButton = driver.findElement(By.linkText("Logout"));
		logoutButton.click();

	}

	@AfterClass
	public void closeBrowser() {

		System.out.println("Test passed");
		driver.close();
	}

}
