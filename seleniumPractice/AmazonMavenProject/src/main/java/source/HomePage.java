package source;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountAndListHoverOver;

	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signIn_tologin;

	@FindBy(xpath = "//span[.='Sign Out']")
	WebElement signOut;

	@FindBy(id = "twotabsearchtextbox")
	WebElement search_tf;

	@FindBy(xpath = "//div[@class='a-section aok-relative s-image-tall-aspect']")
	WebElement product;

	@FindBy(linkText = "Your Wish List")
	WebElement yourwishlist;
	
	WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30));

	public void accountAndListHoverOver(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountAndListHoverOver).perform();
	}

	public void signin() {
		signIn_tologin.click();
	}

	public boolean verifysignOut_option(WebDriver driver) {
		accountAndListHoverOver(driver);
		boolean status = signOut.isDisplayed();
		return status;
	}

	public void searching() {
		search_tf.sendKeys("shoe" + Keys.ENTER);
	}

	public void selectProduct() {
		product.click();
	}

	public void removefromyWishlist(WebDriver driver) {
		accountAndListHoverOver(driver);
		wb.until(ExpectedConditions.visibilityOf(yourwishlist)).click();
	}

	public void signout(WebDriver driver) {
		if (verifysignOut_option(driver)) {
			signOut.click();
		}
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
