package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Assignment 46: WAP for below annotation and check execution
 				 @BeforeTest
				 @BeforeClass
				 @BeforeMethod
				 @AfterMethod
				 @Test
*/

public class AS46_Test_BeforeTest_BeforeClass_BeforeMethod_AfterMethod {

	static ChromeDriver driver;

	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void bc() {
		// login to application
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@BeforeMethod
	public void checksuccessfulLogin() {
		WebElement productTest = driver.findElement(By.xpath("//span[.='Products']"));
		boolean status = productTest.isDisplayed();

		if (status) {
			System.out.println("Login SuccessFul");
		} else {
			System.out.println("Login Failed");
		}
	}

	@Test
	public void printFotterDetailsofswagLabsPage() throws InterruptedException {

		// print Fotter Details of swagLabs Page
		WebElement footer = driver.findElement(By.className("footer_copy"));
		Thread.sleep(2000);
		String footerDetails = footer.getText();
		Thread.sleep(2000);
		System.out.println("\n" + footerDetails);
		Thread.sleep(2000);
	}

	@AfterMethod
	public void logot() throws InterruptedException {
		System.out.println("Test passed");
		driver.close();
	}

}
