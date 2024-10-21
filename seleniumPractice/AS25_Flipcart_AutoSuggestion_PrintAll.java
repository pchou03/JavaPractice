package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 24: Launch Flipkart , Type "Mobiles" and from auto-suggestions print all options
//use html-> source to write xpath

public class AS25_Flipcart_AutoSuggestion_PrintAll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//type mobile on google search bar
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("mobile");
		Thread.sleep(2000);
		
		List<WebElement> autoSuggestions =driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
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
