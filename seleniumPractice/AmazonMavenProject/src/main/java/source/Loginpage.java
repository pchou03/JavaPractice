package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	@FindBy(id = "ap_email")
	WebElement username_tf;

	@FindBy(id = "continue")
	WebElement continue_button;
	
	@FindBy(name = "password")
	WebElement password_tf;
	
	@FindBy(id = "auth-signin-button")
	WebElement signin_button;

	
	public void un() {
		username_tf.sendKeys("prashant7538@gmail.com");
	}

	public void un_continue() {
		continue_button.click();
	}

	public void pwd() {
																																																																								password_tf.sendKeys("Prashant@123");
	}

	public void pwd_signin() {
		signin_button.click();
	}

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
