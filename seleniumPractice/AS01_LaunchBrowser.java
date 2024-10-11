package seleniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//Assignment1: WAP for launch multiple empty browser like Chrome,Firefox,Edge,safari

public class AS01_LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		FirefoxDriver  firefox= new FirefoxDriver();
		firefox.manage().window().maximize();
		
		EdgeDriver edge = new EdgeDriver();
		edge.manage().window().maximize();
		
//		SafariDriver safari = new SafariDriver();   //will work on only mac
//		safari.manage().window().maximize();   
		
		chromeDriver.close();
		firefox.close();
		edge.close();
		
	}

}
