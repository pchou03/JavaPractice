package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Assignment 53: WAP to search multiple data on google. using DataProvider annotation

public class AS53_DataProvider_RunSameTest_MultipleTimes_MultipleInputs {

	@DataProvider(name = "set1")
	public Object[][] dataProviderMethod() {

		return new Object[][] { { "India" }, { "SriLanka" }, { "South Africa" } };
	}

	@Test(dataProvider = "set1")
	public void searchOnGoogle(String inputs) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");
		WebElement searchTextBox = driver.findElement(By.name("q"));
		searchTextBox.sendKeys(inputs);
		searchTextBox.sendKeys(Keys.ENTER);

		driver.close();
	}

}
