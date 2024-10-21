package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Assignment 39: Handle javascript popup in https://grotechminds.com/javascript-popup/ page.

public class AS39_HandleJavaScript_popUp_Growtech {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		WebElement javascriptopoUp = driver.findElement(By.className("btnjs"));
		javascriptopoUp.click();

		Thread.sleep(4000);
		// Handle javascript popup
		driver.switchTo().alert().accept();
		
		System.out.println("javascript pop-Up handled ");

		driver.close();
	}

}
