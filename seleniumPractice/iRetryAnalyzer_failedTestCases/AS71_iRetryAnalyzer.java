package iRetryAnalyzer_failedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AS71_iRetryAnalyzer implements IRetryAnalyzer {

	int initialCount = 0;
	int retryCount = 1;

	@Override
	public boolean retry(ITestResult result) {

		if (initialCount < retryCount) 
		{
			initialCount++;
			return true;
		}

		return false;
	}

}
