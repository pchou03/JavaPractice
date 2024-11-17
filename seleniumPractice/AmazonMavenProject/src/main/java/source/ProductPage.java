package source;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	WebDriver driver;
	private String parentWindowID;
	private String childWindowID;

	@FindBy(id = "wishListMainButton")
	WebElement wishlist;

	@FindBy(xpath = "(//span[@id='continue-shopping'])//span[.='Continue shopping']")
	WebElement continueShopping;

	@FindBy(id = "add-to-cart-button")
	WebElement addToCart;

	@FindBy(id = "NATC_SMART_WAGON_CONF_MSG_SUCCESS")
	WebElement addToCartText;

	@FindBy(linkText = "Go to Cart")
	WebElement gotocart;

	WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30));

	public void getWindowHandles(WebDriver driver) {
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		this.parentWindowID = itr.next();
		this.childWindowID = itr.next();
	}

	public void switchToPrevoiusWindow(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void switchToChildWindow(WebDriver driver) {
		getWindowHandles(driver);
		driver.switchTo().window(childWindowID);
	}

	public void addToWishList(WebDriver driver) {

		boolean status1 = wishlist.isDisplayed();

		if (status1) {
			wishlist.click();
			switchToChildWindow(driver);
			wb.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();
		}

	}

	public void addToCart(WebDriver driver) throws InterruptedException {
		switchToPrevoiusWindow(driver);
		wb.until(ExpectedConditions.invisibilityOf(continueShopping));
		wb.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
	}

	public String verifyText() {
		String text = wb.until(ExpectedConditions.visibilityOf(addToCartText)).getText();
		return text;
	}

	public void goToCartclickButton() {
		gotocart.click();
	}

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
