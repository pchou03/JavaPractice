package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment5: WAP :on Youtube Search Grotechminds with help of ID locator

public class AS05_SearchOnYoutube {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement searchTextBox = driver.findElement(By.name("search_query"));
		searchTextBox.sendKeys("mobile");
		WebElement  searchIcon= driver.findElement(By.id("search-icon-legacy"));
		searchIcon.click();
			
		driver.quit();

	}

}
