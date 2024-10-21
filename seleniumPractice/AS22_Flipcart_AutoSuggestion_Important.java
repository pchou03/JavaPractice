package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 22: Launch Flipkart , Type "Mobiles" and from auto-suggestions select last Auto-suggestion option
//use html-> source to write xpath

public class AS22_Flipcart_AutoSuggestion_Important 
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
		
		//take list of suggestion
		//you cant inspect flipKart Autosuggestion mean when you do right click it goes off
		//so type mobile go to html -> source -> click on play button & pause screen-> 
		// go to Elements html code -> serch mobile in html code and write xpath
		
		List<WebElement> li =driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count = li.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		//clicking on last element
		li.getLast().click();
		
		System.out.println(li);
		
		driver.close();
		
	}

}
