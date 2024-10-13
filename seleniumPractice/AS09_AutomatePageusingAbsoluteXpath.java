package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 9: WAP on learning htmt file with help of absolute Xpath
//	(here not to use components Your Last name,Relegion,submit ,submit,and sign up )


public class AS09_AutomatePageusingAbsoluteXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Shree\\eclipse-workspace\\SeleniumProject\\src\\seleniumAssignments\\learningHTML.html");
		
		//userName, hint , password
		WebElement userName=driver.findElement(By.xpath("(/html/body/input)[1]"));	
		userName.sendKeys("username@123");
		WebElement hint =driver.findElement(By.xpath("(/html/body/input)[2]"));	
		hint.sendKeys("UseAlphaNumericPassword");
		WebElement password =driver.findElement(By.xpath("(/html/body/input)[3]"));	
		password.sendKeys("Pass@123");
		
		//firstname
		WebElement firstName =driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));	
		firstName.sendKeys("Prashant");
		
		//I am a boy,girl,baby
		WebElement boy =driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));	
		boy.click();
		WebElement girl =driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));	
		girl.click();
		WebElement baby =driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));	
		baby.click();
		
		//male, Female
		WebElement male =driver.findElement(By.xpath("(/html/body/input)[4]"));	
		male.click();
		WebElement female =driver.findElement(By.xpath("(/html/body/input)[5]"));	
		female.click();	
		
		//relocate
		WebElement relocate =driver.findElement(By.xpath("(/html/body/input)[6]"));	
		relocate.click();
		
		//linktext
		WebElement linkText =driver.findElement(By.tagName("a"));	
		linkText.click();
		
		driver.close();
	}

}
