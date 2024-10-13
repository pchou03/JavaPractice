package seleniumAssignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS08_getWindowHandleDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : " + pageTitle);
		
		String getWindow=			 driver.getWindowHandle();
		Set<String> getWindowHanles= driver.getWindowHandles();
		//  if you store this in 'List<String>' it will give exception :- 
		//	exception = java.lang.ClassCastException
		
		System.out.println("Single window Parent id in String :  " +getWindow);
		System.out.println("WindowHandles Parent id in Set<String> :  " +getWindowHanles);
		
		driver.close();
	}

}
