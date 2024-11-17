package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import source.HomePage;
import source.Loginpage;
import source.ProductPage;

public class TestCase4 extends LaunchQuit {

	@Test
	public void login_Serach_WishList_Cart_Logout() throws InterruptedException {
		HomePage h1 = new HomePage(driver);
		h1.accountAndListHoverOver(driver);
		h1.signin();

		Loginpage l1 = new Loginpage(driver);
		l1.un();
		l1.un_continue();
		l1.pwd();
		l1.pwd_signin();

		// serach product
		h1.searching();

		// add to wishList
		h1.selectProduct();
		ProductPage p1 = new ProductPage(driver);
		p1.switchToChildWindow(driver);
		p1.addToWishList(driver);

		// add to cart
		p1.addToCart(driver);
		Assert.assertEquals(p1.verifyText(), "Added to cart");

		// lougot
		h1.signout(driver);

	}

}
