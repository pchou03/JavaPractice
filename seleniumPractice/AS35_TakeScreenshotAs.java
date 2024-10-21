package seleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Assignment 35: Write a Script to take a screenshot

public class AS35_TakeScreenshotAs {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String SrcPath = "C:\\Users\\Shree\\eclipse-workspace\\SeleniumProject\\src\\seleniumAssignments\\screenshot\\";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts = driver;
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(SrcPath+ "Amazon" + Math.random() + ".png");
		Thread.sleep(2000);
		FileHandler.copy(source, dest);
		
		driver.close();
	}

}
