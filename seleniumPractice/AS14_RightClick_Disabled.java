package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 14 :  Check Right click is disable in any banking application ex IDFC, ICICI etc and Insepct It
// use F12 button to get html code

public class AS14_RightClick_Disabled {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		
		WebElement e2=	driver.findElement(By.id("username"));
		e2.sendKeys("manish6543");
		
		WebElement e3=	driver.findElement(By.name("password"));
		e3.sendKeys("mabuyt56y");
		
		WebElement e4=	driver.findElement(By.id("loginCaptchaValue"));
		e3.sendKeys("captch");
		
		WebElement e5=	driver.findElement(By.id("loginCaptchaValue"));
		e3.sendKeys("captch");
		
		
	}

}
