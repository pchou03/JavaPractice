package seleniumAssignments;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS32_GetWindowhandles_NaukariSite {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		
		WebElement e1 =driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();				
		Set<String> s1 =driver.getWindowHandles();
		
		System.out.println(s1);
		
		Iterator<String> i1= s1.iterator();
		
		String parentId = i1.next();
		String childId  = i1.next();
		System.out.println(parentId);
		System.out.println(childId);
		
		//move control to child window
		
		driver.switchTo().window(childId);
		
		driver.close(); //will close child window only
		
	}

}
