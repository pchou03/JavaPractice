package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Assignment 16 : In grotech application site,  go to register page Write code for 3 drop downs

public class AS16_HandleDropDown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement skillsDropDown=driver.findElement(By.id("Skills"));			
		Select s1 = new Select(skillsDropDown);
		s1.selectByIndex(1);
		
		WebElement countryDropDown=driver.findElement(By.id("Country"));			
		Select s2 = new Select(countryDropDown);
		s2.selectByValue("India");		
		WebElement firstSelected =s2.getFirstSelectedOption();
		System.out.println(firstSelected);
		
		WebElement relegionDropDown=driver.findElement(By.id("Relegion"));			
		Select s3 = new Select(relegionDropDown);
		s3.selectByVisibleText("Hindu");		
		List<WebElement> allSelectedOptions =s3.getAllSelectedOptions();
		System.out.println(allSelectedOptions);
		
//		s1.deselectByIndex(1);     
//		s2.deselectByValue("India");
//		s3.deselectByVisibleText("Hindu");		

	}

}
