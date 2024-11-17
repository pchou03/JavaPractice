package seleniumAssignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS74_FindBrokenLinksInWebsite {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");

		List<WebElement> links = driver.findElements(By.xpath("//a"));

		int count = links.size();
		System.out.println("Total links present are : " + count);

//		for (WebElement link : links) {
//			
//			System.out.println(link.getText());
//			
//			String AttributeValue = link.getAttribute("href");
//			
//			System.out.println(AttributeValue);
//		}

		for (int i = 0; i < count; i++) {

			WebElement e1 = links.get(i);
			String url = e1.getAttribute("href");
			System.out.println(url);
			verifyLinks(url);
		}

		driver.close();
	}

	static void verifyLinks(String url) throws IOException {

		try {
			URL ul = new URL(url);
			HttpURLConnection u2 = (HttpURLConnection) ul.openConnection();

			if (u2.getResponseCode() == 200) {
				System.out.println("Link Is valid " + url + " " + u2.getResponseMessage());
			} else {
				System.out.println("Link Is not valid " + url + " " + u2.getResponseMessage());
			}

		} catch (MalformedURLException e1) {
			System.out.println("Handled the exception");
		}

	}
}
