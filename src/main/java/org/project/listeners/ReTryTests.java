package org.project.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ReTryTests implements IRetryAnalyzer, ITestNGListener{

	@Override
	public boolean retry(ITestResult result) {
		int count = 0;
		int maxRetryCount = 2;
		
		if(count < maxRetryCount) {
			System.out.println("Count before ++ => " + count);
			count++;
			System.out.println("Count before ++ => " + count + ", Returning true.");
			return true;
		}
		else {
			return false;
		}
	}
}
