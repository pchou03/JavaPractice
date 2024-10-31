package seleniumAssignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment 57  : Login to amazon with DDT

public class AS57_AmazonLogin_With_DDT {

	static String path = "C:\\Users\\Shree\\eclipse-workspace\\SeleniumProject\\DataSheet\\LoginSheet.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		// Excel data read
		FileInputStream fs = new FileInputStream(path);
		Workbook w1 = WorkbookFactory.create(fs);

		String usernameValue = w1.getSheet("AmazonLogin").getRow(1).getCell(0).getStringCellValue();
		String passwordValue = w1.getSheet("AmazonLogin").getRow(1).getCell(1).getStringCellValue();

		// Amazon browser launch
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// HoverOver and click on link
		WebElement hoverOver = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOver).perform();

		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		signInLink.click();

		// Login Process -> Enter emil, password, click continue button ,sign in btk
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(usernameValue);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(passwordValue);
		
		WebElement signInBtk = driver.findElement(By.id("signInSubmit"));
		signInBtk.click();

	}

}
