package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS02_TypeIndiaOnGoogleSearchBar {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");
		WebElement searchTextBox = driver.findElement(By.name("q"));
		searchTextBox.sendKeys("India");
		
		driver.quit();
		
	}
}
