package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment 15: WAP in Amazon.in hoverover on language -select any language(ex:-kannada)

public class AS15_ChooseFavouriteLangaugeUsing_HoverOver {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement hoverOver= driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOver).perform();
		
		WebElement langauge = driver.findElement(By.xpath("//div[.='MR']"));
		langauge.click();
		
		WebElement e2 = driver.findElement(By.xpath("(//a[@class='nav-link                                    nav-item'])[3]"));
        e2.click();
	}

}
