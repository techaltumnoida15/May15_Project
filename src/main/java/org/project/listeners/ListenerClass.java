package org.project.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.projectName.com.BaseTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//result.getStatus() == ITestResult.FAILURE
		//Take Screensot
		
		String testMethodName = result.getMethod().getMethodName();
		System.out.println("testMethodName = " + testMethodName);
		
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
		}
		*/
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	}

}
