package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Assignment 38: Handle javascript popup in https://grotechminds.com/registration/ page.

public class AS38_HandleJavaScript_popUp {

	static ChromeDriver driver;

	public static void launchBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void sendkeys(String id, String text) {
		WebElement element = driver.findElement(By.id(id));
		element.sendKeys(text);
	}

	public static void click(String id) {
		WebElement element = driver.findElement(By.id(id));
		element.click();
	}

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("https://grotechminds.com/registration/");

		// text Fields
		sendkeys("fname", "Prashant");
		sendkeys("lname", "Chougale");
		sendkeys("email", "prashant@gmail.com");
		sendkeys("password", "Cho@2026");

		// radioButton
		click("male");

		// DropDown
		WebElement skillsDropDown = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skillsDropDown);
		s1.selectByIndex(1);

		WebElement countryDropDown = driver.findElement(By.id("Country"));
		Select s2 = new Select(countryDropDown);
		s2.selectByValue("India");

		// textArea
		sendkeys("Present-Address", "At- wagholi, City-Pune, maharashtra");
		sendkeys("Permanent-Address", "At- wagholi, City-Pune, maharashtra");
		sendkeys("Pincode", "411027");

		// DropDown
		WebElement relegionDropDown = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(relegionDropDown);
		s3.selectByVisibleText("Hindu");

		// File upload
		WebElement browserFile = driver.findElement(By.id("file"));
		browserFile.sendKeys("C:\\Users\\Shree\\Downloads\\learningHTML.html");

		// checkbox
		click("relocate");

		// submit button		
		WebElement submit=driver.findElement(By.name("Submit"));
		submit.click();
		
		Thread.sleep(2000);
		
		// Handle javascript popup
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
