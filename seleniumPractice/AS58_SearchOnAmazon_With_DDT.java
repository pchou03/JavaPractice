package seleniumAssignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Assignment 57  : Login to amazon with DDT

public class AS58_SearchOnAmazon_With_DDT {

	static String path = "C:\\Users\\Shree\\eclipse-workspace\\SeleniumProject\\DataSheet\\LoginSheet.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		// Excel data read
		FileInputStream fs = new FileInputStream(path);
		Workbook w1 = WorkbookFactory.create(fs);

		String product = w1.getSheet("SearchOnAmazon").getRow(1).getCell(0).getStringCellValue();

		// Amazon browser launch
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		//type shoe on amazon search bar
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(product + Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
