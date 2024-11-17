package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import source.CartPage;
import source.HomePage;
import source.Loginpage;
import source.ProductPage;


@Listeners(source.ListenerPro.class)
public class TestCase5 extends LaunchQuit{
	
	@Test(retryAnalyzer = source.RetryClass.class)
	public void remove_fromcart_fromWishList_logout() throws InterruptedException {
		HomePage h1 = new HomePage(driver);
		h1.accountAndListHoverOver(driver);
		h1.signin();

		Loginpage l1 = new Loginpage(driver);
		l1.un();
		l1.un_continue();
		l1.pwd();
		l1.pwd_signin();

		// search product
		h1.searching();

		// add to wishList
		h1.selectProduct();
		ProductPage p1 = new ProductPage(driver);
		p1.switchToChildWindow(driver);
		p1.addToWishList(driver);

		// add to cart
		p1.addToCart(driver);
		p1.goToCartclickButton();
		
		//remove from cart -> 
		CartPage cp=new CartPage(driver);
		cp.removeFromCart();
		
		//remove from WishList
		h1.removefromyWishlist(driver);

		// lougot
		h1.signout(driver);

	}

}
