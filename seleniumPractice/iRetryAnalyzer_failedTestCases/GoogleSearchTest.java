package iRetryAnalyzer_failedTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	// @Test(retryAnalyzer =packagename.classname.class)
	@Test(retryAnalyzer = iRetryAnalyzer_failedTestCases.AS71_iRetryAnalyzer.class)
	public void searchTest() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.name("qi"));
		e1.sendKeys("India" + Keys.ENTER);
		driver.quit();
	}

}
