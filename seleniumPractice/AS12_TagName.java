package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 12: WAP for TagName locator using learning HTML file

public class AS12_TagName {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Shree\\eclipse-workspace\\SeleniumProject\\src\\classProblems\\learningHTML.html");
		WebElement e1=driver.findElement(By.tagName("a"));	
		e1.click();
		
		driver.close();
	}

}
