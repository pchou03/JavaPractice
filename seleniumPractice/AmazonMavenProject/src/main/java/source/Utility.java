package source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	WebDriver driver;

	public void webDriverWait(WebDriver driver, int time) {
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(time));
	}

	public void visibilityOfWait(WebDriver driver, WebElement ele, int time) {

		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(time));
		wb.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public String visibilityOfWait2(WebDriver driver, WebElement ele, int time) {

		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(time));
		String text = wb.until(ExpectedConditions.visibilityOf(ele)).getText();
		return text;
	}

}
