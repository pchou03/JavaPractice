package testNgAssignmens;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Assignment 52: WAP which is having. @beforeMethod, @afterMethod and 2 test cases and should perform below steps
				1. launch browser 
				2. Testcase1 - Login to amazon search for any product, 
				3. Testcase2 - Login to Amazon and Add product to wishlist
				4. Close browser
*/

public class AS52_AmazonProblemusingTestNG {

	static ChromeDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	}

	@Test
	public static void searchProduct() throws InterruptedException {

		// type shoe on amazon search bar
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" + Keys.ENTER);
		Thread.sleep(2000);
	}

	@Test
	public void AddToWishlist() throws InterruptedException {

		searchProduct();

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
		System.out.println("@AfterMethod");
		System.out.println();
		driver.quit();
	}

}
