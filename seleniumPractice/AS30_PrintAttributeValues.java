package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 30: Print attribute values for particular attribute name

public class AS30_PrintAttributeValues {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");

			List<WebElement> links = driver.findElements(By.xpath("//a"));

			Thread.sleep(2500);
			
			for (WebElement link : links) 
			{				
				String AttributeValue = link.getAttribute("id");				
				System.out.println(AttributeValue);
			}

			driver.close();
		}

}
