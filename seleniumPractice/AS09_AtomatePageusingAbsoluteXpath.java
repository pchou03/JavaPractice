package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 9: WAP on learning htmt file with help of absolute Xpath
//	(here not to use components Your Last name,Relegion,submit ,submit,and sign up )


public class AS09_AtomatePageusingAbsoluteXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Documents/Selenium/learningHTML1%20-%20Copy.html");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		
		

	}

}
