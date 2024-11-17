package test;

import org.testng.annotations.Test;

import source.HomePage;
import source.Loginpage;
import source.ProductPage;

public class TestCase3 extends LaunchQuit {

	@Test
	public void login_Serach_WishList_LogoutFrom_amazon() {
		HomePage h1 = new HomePage(driver);
		h1.accountAndListHoverOver(driver);
		h1.signin();

		Loginpage l1 = new Loginpage(driver);
		l1.un();
		l1.un_continue();
		l1.pwd();
		l1.pwd_signin();

		//search product
		h1.searching();

		//add to wishList
		h1.selectProduct();		
		ProductPage p1 = new ProductPage(driver);
		p1.switchToChildWindow(driver);
		p1.addToWishList(driver);
		
		//logot
		h1.signout(driver);

	}

}
