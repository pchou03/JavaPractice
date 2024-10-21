package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//Assignment 17: WAP on Drag and Drop using "https://grotechminds.com/drag-and-drop/" website

public class AS17_DragAndDrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement source=driver.findElement(By.id("container-10"));

		WebElement target=driver.findElement(By.id("div2"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(source, target).perform();
		
		
		driver.close();
	}

}
