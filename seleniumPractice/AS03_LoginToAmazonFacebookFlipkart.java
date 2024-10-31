package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment3: Login to Amazon ,Facebook,flipkart provide email and pwd then click on login


public class AS03_LoginToAmazonFacebookFlipkart 
{
	static ChromeDriver driver;
	
	public static void launchBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void facebookLogin() throws InterruptedException
	{	
		launchBrowser();
		driver.get("https://www.facebook.com/");		
		WebElement fEmail =driver.findElement(By.id("email"));
		fEmail.sendKeys("username@gmail.com");
		WebElement fPass =driver.findElement(By.id("pass"));
		fPass.sendKeys("username@gmail.com");
		
		WebElement floginbutton =driver.findElement(By.name("login"));
		floginbutton.click();
		Thread.sleep(10000);
		
	}
	
	public static void amazonLogin() throws InterruptedException
	{	
		launchBrowser();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fl%2F100656700031%3Ftag%3Dfbcmapoth-in-21%26ascsubtag%3Dpfb-COFFEETAB-1-9-q6bz2w68t1w93gop%26ref_%3Dnav_signin%26mcid%3De90f1e3a4c613cd4aa7e0646f96c6092%26fbclid%3DPAZXh0bgNhZW0BMAABpstAcJYvw181UYLwzxvtErY0cBGF9LXhf9v6o25IBeg9a8OtP5KY_DIVzQ_aem_crHtG6Ix_PlqVdaM4POZ2w%26discounts-widget%3D%252522%25257B%25255C%252522state%25255C%252522%25253A%25257B%25255C%252522refinementFilters%25255C%252522%25253A%25257B%25257D%25257D%25252C%25255C%252522version%25255C%252522%25253A1%25257D%252522&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");		
		WebElement amazEmail =driver.findElement(By.id("ap_email"));
		amazEmail.sendKeys("username@gmail.com");		
		WebElement continuebutton =driver.findElement(By.id("continue"));
		continuebutton.click();
		Thread.sleep(10000);
		
	}
	
	public static void flipcartLogin() throws InterruptedException
	{	
		launchBrowser();
		driver.get("https://www.flipkart.com/account/login?ret=/");	
		WebElement flipEmail =driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		flipEmail.sendKeys("username@gmail.com");
		
		WebElement RequestOTP = driver.findElement(By.xpath("//button[.='Request OTP']"));
		RequestOTP.click();		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		facebookLogin();
		flipcartLogin();		
		amazonLogin();
		
		driver.quit();
	}
	

}
