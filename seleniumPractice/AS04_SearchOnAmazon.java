package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment4: With help of ID Locator  search something on Amazon

public class AS04_SearchOnAmazon {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBox.sendKeys("mobile");
		WebElement  searchicon= driver.findElement(By.id("nav-search-submit-button"));
		searchicon.click();
		
		driver.quit();
		
	}
}
