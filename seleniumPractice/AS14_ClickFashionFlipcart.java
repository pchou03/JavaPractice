package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 14 : Launch Flipkart Application and click on Fashion.

public class AS14_ClickFashionFlipcart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		fashion.click();
		
		Thread.sleep(10000);
		driver.close();
	}

}
