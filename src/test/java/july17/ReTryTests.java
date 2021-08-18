package july17;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryTests implements IRetryAnalyzer{

	private int count = 0;
	private static int maxRetryCount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count < maxRetryCount) {
			count++;
			return true;
		}
		else {
			return false;
		}
	}
}
