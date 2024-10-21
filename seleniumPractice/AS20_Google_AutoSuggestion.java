package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Assignment 20: Launch google, Type "Bangalore" and from auto-suggestions select 6th Auto-suggestion option

public class AS20_Google_AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		//type banglore on google search bar
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Banglore");
		Thread.sleep(2000);
		
		//take list of suggestion
		List<WebElement> li =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = li.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		//clicking on 6th element
		li.get(5).click();
		
		driver.close();
		
	}

}
