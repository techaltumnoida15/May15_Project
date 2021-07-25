package org.project.listeners;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.projectName.com.DriverManager;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener, ISuiteListener{
	
	@Override
	public void onStart(ISuite suite) {
		//Code
	}

	@Override
	public void onFinish(ISuite suite) {
		//Code
	}

	private String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy_hh_mm_ss"));

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getMethod().getMethodName() + " starting.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " Fail.");
		
		String screenshotPath = System.getProperty("user.dir") + "\\screenshots\\failTests\\" + testName + "_" + currentDateTime + ".jpeg";
		File srcScreen = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		File destScreen = new File(screenshotPath);
	
}
		
	}
		

		/*
		if(!result.isSuccess()) {
			File srcScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String screenshotPathAndName = System.getProperty("user.dir") + "\\Screenshots\\" +result.getMethod().getMethodName() +  ".jpeg";
			
			File destFile = new File(screenshotPathAndName);
			
			try {
				FileUtils.moveFile(srcScreen, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
=======
		try {
			FileUtils.moveFile(srcScreen, destScreen);
		} catch (IOException e) {
			e.printStackTrace();
>>>>>>> e3eedc4685963bd94c5ec4cde26aafb34b81aead
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
*/
