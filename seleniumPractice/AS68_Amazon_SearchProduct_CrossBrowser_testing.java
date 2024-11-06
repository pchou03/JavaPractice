package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Assignment 66 : Run Test of Search product on Amazon to run parallely on multiple browsers

public class AS68_Amazon_SearchProduct_CrossBrowser_testing {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browserName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}

		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Test
	public void searchProductOnAmazon() throws InterruptedException {
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("shoes" + Keys.ENTER);
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}

}
