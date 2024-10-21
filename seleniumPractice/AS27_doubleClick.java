package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment 27 : launch google and Double click on Gmail

public class AS27_doubleClick {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");
		
		WebElement gmail =driver.findElement(By.linkText("Gmail"));
		
		Actions a1 = new Actions(driver);
		a1.doubleClick(gmail).perform();
		
		driver.close();

	}

}
