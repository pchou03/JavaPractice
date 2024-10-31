package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment11: WAP launch Amazon.in try to search something using search field using relative Xpath

public class AS11_searchOnAmazonUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchTextBox = driver.findElement(By.xpath("(//input)[5]"));
		// imp: use parenthesis while using indexing otherwise xpath will not work in
		// future
		searchTextBox.sendKeys("mobile" + Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}

