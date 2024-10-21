package seleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Assignment 36: Try to take a screenshot in wrong location,and findout exception type.

public class AS36_TakeScreenshot_AtWrongLocation_WhichDosentExist {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// java.io.FileNotFoundException: F:\WrongLocation\screenshot\WrongLocationScreenshot.png (The device is not ready)
		String SrcPath = "F:\\WrongLocation\\screenshot\\WrongLocationScreenshot";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts = driver;
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(SrcPath + ".png");
		Thread.sleep(2000);
		FileHandler.copy(source, dest);
		
		driver.close();
	}

}
