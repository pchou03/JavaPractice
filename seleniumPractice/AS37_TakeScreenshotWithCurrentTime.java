package seleniumAssignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Assignment 37: Take a screenshot wth current time/unique screenshot

public class AS37_TakeScreenshotWithCurrentTime {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Get current Date&Time 
        LocalTime currentTime = LocalTime.now(); // Get the current time 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");  // Define a formatter for displaying time
        String formattedTime = currentTime.format(formatter); // Format the current time
              
        System.out.println(formattedTime);
        //  time->  08:25:18 PM -> file cannot contain special charatcers so replace : with _
        formattedTime=formattedTime.replaceAll(":", "_");
                
        //path to store screenshot
        String SrcPath = "C:\\Users\\Shree\\eclipse-workspace\\SeleniumProject\\src\\seleniumAssignments\\screenshot\\";
		
        //invoke browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		
		// take screenshot code
		TakesScreenshot ts = driver;
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(SrcPath+ "CurrentTimeScreenShot " + formattedTime + ".png");
		
		Thread.sleep(2000);
		FileHandler.copy(source, dest);
		
		driver.close();        
	}

}
