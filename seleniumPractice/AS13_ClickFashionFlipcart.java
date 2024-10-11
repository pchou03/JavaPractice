package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS13_ClickFashionFlipcart {

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
