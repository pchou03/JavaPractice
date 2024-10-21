package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 21 : Launch Amazon.in , Type "Shoe" and from auto-suggestions select 2nd Auto-suggestion option

public class AS21_Amazon_AutoSuggestion2 
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
		List<WebElement> li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = li.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		//clicking on 2nd element
		li.get(2).click();
		
		driver.close();
		
	}

}
