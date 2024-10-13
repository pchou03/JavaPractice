package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment7: WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator

public class AS07_LaunchAmazonAndClickOnCustomerService 
{

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement customerService = driver.findElement(By.partialLinkText("Customer Service"));
		customerService.click();
		
		driver.quit();
		
	}

}
