package testNgAssignmens;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Assignment 67: Run Test of Search product on Amazon, 
//				 Search and add product to wishlist to run parallely on multiple browsers

public class AS69_AmazonAddToWishlist_CrossBrowserTest {

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
	@Parameters("browser")
	public void AddToWishist() throws InterruptedException {
		// type shoe on amazon search bar
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" + Keys.ENTER);
		Thread.sleep(2000);

		// click 1st shoe
		WebElement e2 = driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		e2.click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> i1 = s1.iterator();

		String parentId = i1.next();
		String childId = i1.next();
		System.out.println(parentId);
		System.out.println(childId);

		// switch to child window
		driver.switchTo().window(childId);

		Thread.sleep(3000);
		// add to WishList
		WebElement e3 = driver.findElement(By.linkText("Add to Wish List"));
		e3.click();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
