package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 29: Print all the links present in Google home page.

public class AS29_PrintAllLinksOnPage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");

		List<WebElement> links = driver.findElements(By.xpath("//a"));

		for (WebElement link : links) {
			
			System.out.println(link.getText());
			
			String AttributeValue = link.getAttribute("href");
			
			System.out.println(AttributeValue);
		}

		driver.close();
	}

}
