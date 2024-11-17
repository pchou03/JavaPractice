package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import source.HomePage;
import source.Loginpage;

public class TestCase2 extends LaunchQuit {

	@Test
	public void loginSerachLogoutFromamazon() 
	{
		//navigate to signin option on homepage
		HomePage h1 = new HomePage(driver);		
		h1.accountAndListHoverOver(driver);
		h1.signin();
		
		//login to amazon
		Loginpage l1 = new Loginpage(driver);
		l1.un();
		l1.un_continue();
		l1.pwd();
		l1.pwd_signin();
		
		//search 
		h1.searching();
		
		//logout from amazon
		h1.signout(driver);		
		String pageTitle = driver.getTitle();
	    Assert.assertTrue(pageTitle.contains("Amazon Sign In"), "Logout failed, Page title does not indicate login page");
	}
}
