package seleniumAssignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Assignment 23: Launch google, Type "Bangalore" and from auto-suggestions print all options

public class AS23_Google_AutoSuggestion_PrintAll 
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
		List<WebElement> autoSuggestions =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = autoSuggestions.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		
		for(WebElement autoSuggestion : autoSuggestions)
		{
			System.out.println(autoSuggestion.getText());
		}	
		
		driver.close();
		
	}

}
