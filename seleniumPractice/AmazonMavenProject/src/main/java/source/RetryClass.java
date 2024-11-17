package source;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {

	int currentCount = 0;
	int retryCount = 1;

	@Override
	public boolean retry(ITestResult result) {
		if (currentCount < retryCount) {
			currentCount++;
			return true;
		}
		return false;
	}

}
