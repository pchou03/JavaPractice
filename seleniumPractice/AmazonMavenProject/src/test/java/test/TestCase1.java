package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import source.HomePage;
import source.Loginpage;

@Listeners(source.ListenerPro.class)
public class TestCase1 extends LaunchQuit 
{
	@Test(retryAnalyzer = source.RetryClass.class)
	public void loginToAmazon() 
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
		
		Assert.assertTrue(h1.verifysignOut_option(driver), "Sign Out option is not displayed under Account & Lists");
	}
}
