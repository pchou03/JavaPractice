package seleniumAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS33_GetWindowhandles_AmazonAddShoeToCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");

		// type shoe on amazon search bar
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" +Keys.ENTER);
		Thread.sleep(2000);
		
		//click 1st shoe
		WebElement e2 = driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		e2.click();
		
		Set<String> s1 =driver.getWindowHandles();
		
		Iterator<String> i1= s1.iterator();
		
		String parentId = i1.next();
		String childId  = i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		
		//switch to child window
		driver.switchTo().window(childId);
		
		Thread.sleep(3000);
		//add to cart
		WebElement e3 = driver.findElement(By.id("add-to-cart-button"));
		e3.click();

		
	}

}
