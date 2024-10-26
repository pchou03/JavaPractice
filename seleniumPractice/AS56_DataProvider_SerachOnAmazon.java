package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Assignment 56: Search something on Amazon with 10 inputs using Dataprovider

public class AS56_DataProvider_SerachOnAmazon {

	@DataProvider(name = "set1")
	public Object[][] dataProviderMethod() {

		return new Object[][] { { "Shoes" }, { "Mobile" }, { "TV" },{ "laptop" }, { "watch" },{ "toys" },{ "Refrigerators" },{ "Washing machine" },{ "Beds" },{ "sandles" }};
	}

	@Test(dataProvider = "set1")
	public void searchOnGoogle(String inputs) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		// type on amazon search bar
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(inputs + Keys.ENTER);
		Thread.sleep(4000);

		driver.close();
	}

}
