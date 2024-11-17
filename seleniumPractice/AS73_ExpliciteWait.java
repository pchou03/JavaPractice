package seleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AS73_ExpliciteWait {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");

		// WebDriverWait -> TimeOut exception will come if condition fails
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Manish"));

		w1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("a")));

		WebElement searchTextBox = driver.findElement(By.name("q"));
		searchTextBox.sendKeys("India" + Keys.ENTER);

		driver.quit();

	}

}
