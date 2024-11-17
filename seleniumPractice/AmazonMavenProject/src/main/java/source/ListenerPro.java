package source;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerPro implements ITestListener {

	static WebDriver driver;
	
	String srcPath = "C:\\Users\\Shree\\eclipse-workspace\\AmazonMavenProject\\Screenshots\\";
	String pass = "\\pass\\AmazonMavenProjectPass" + Math.random() + ".png";
	String fail = "\\fail\\AmazonMavenProjectPass" + Math.random() + ".png";
	String ScreenshotPass = srcPath + pass;
	String Screenshotfail = srcPath + fail;

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case pass");

		TakeScreenshot(ScreenshotPass);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case Failed");

		TakeScreenshot(Screenshotfail);
	}

	public void TakeScreenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
