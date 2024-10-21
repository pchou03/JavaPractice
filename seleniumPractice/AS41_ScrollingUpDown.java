package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS41_ScrollingUpDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//take coordinate of 'About Amazon' present at amazon website footer area
		WebElement e1=	driver.findElement(By.xpath("//a[.='About Amazon']"));
		
		Point p1=e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		//Scroll down
		JavascriptExecutor jse = driver;
		jse.executeScript("window.scrollBy(0, 2100)");
		
		Thread.sleep(3000);
		
		//Scroll up
		jse.executeScript("window.scrollBy(0, -2100)");
		
		//scroll to 'About Amazon' present at amazon website footer area 
		//her x not needed because vertical scrolling is imp here
		jse.executeScript("window.scrollBy(0," + y +")");
	}
}