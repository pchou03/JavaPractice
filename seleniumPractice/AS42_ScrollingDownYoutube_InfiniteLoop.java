package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Assignment 42: Launch Youtube,search for india, scroll down for infinite time

public class AS42_ScrollingDownYoutube_InfiniteLoop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement searchTextBox = driver.findElement(By.name("search_query"));
		searchTextBox.sendKeys("mobile");	
		searchTextBox.sendKeys(Keys.ENTER);
		
		while (true) {  
            // Scroll down by 1000 pixels -> x=0, y=100
			JavascriptExecutor jse = driver;
			jse.executeScript("window.scrollBy(0,100);");           
            Thread.sleep(2000); 
        }
		
//		for (;;) { 
//			JavascriptExecutor jse = driver;
//            jse.executeScript("window.scrollBy(0,1000);");
//
//            Thread.sleep(2000);  
//        }
		
		
		
	}
}