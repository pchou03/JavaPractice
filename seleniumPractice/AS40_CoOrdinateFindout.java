package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 40:Launch Amazon & findout the co-ordinate of About Amazon

public class AS40_CoOrdinateFindout {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//a[.='About Amazon']"));

		Point p1 = e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);

	}
}