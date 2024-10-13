package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment6: WAP launch Amazon.in try to click mobile with help of Linktest Locator 

public class AS06_LaunchAmazonAndClickOnMobile {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		mobile.click();
		
		driver.quit();
		
	}
}
