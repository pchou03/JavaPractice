package seleniumAssignments;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Assignment 13: Launch amazon ,select a catagory as books,
//				  search a book called power of minds and press enter button

public class AS13_SearchBooksOnAmazon 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(e1);
		//s1.selectByIndex(11);  //12th Component
		s1.selectByVisibleText("Books");
		
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("Power of Mind" + Keys.ENTER);
		
		driver.close();
	}

}
