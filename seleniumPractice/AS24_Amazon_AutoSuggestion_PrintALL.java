package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 24 : Launch Amazon.in , Type "Shoe" and from auto-suggestions print all options

public class AS24_Amazon_AutoSuggestion_PrintALL 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		//type shoe on amazon search bar
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		Thread.sleep(2000);
		
		//take list of suggestion
		List<WebElement> autoSuggestions =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
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
