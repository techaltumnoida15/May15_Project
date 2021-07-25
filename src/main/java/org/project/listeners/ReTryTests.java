package org.project.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ReTryTests implements IRetryAnalyzer{

	int count = 0;
	int maxRetryCount = 1;
	
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
