package seleniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AS43_HeadlessMode {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		// FirefoxOptions options = new FirefoxOptions();
		// EdgeOptions options = new EdgeOptions();
		// InternetExplorerOptions options = new InternetExplorerOptions();

		options.addArguments("--headless"); // Launch in headless mode

		// Initialize ChromeDriverwith ChromeOptions
		ChromeDriver driver = new ChromeDriver(options);

		try {
			driver.get("https://www.google.com");
			System.out.println("Page Title: " + driver.getTitle());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}

	}

}
