package source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;

	@FindBy(xpath = "(//div[@id='sc-cart-column'])/div[1]//h2")
	WebElement shoppingcart;

	@FindBy(xpath = "(//span[@data-action='delete'])[1]")
	WebElement deletefromcart;

	WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30));

	public void removeFromCart() {
		wb.until(ExpectedConditions.textToBePresentInElement(shoppingcart, "Shopping Cart"));
		deletefromcart.click();
	}

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}