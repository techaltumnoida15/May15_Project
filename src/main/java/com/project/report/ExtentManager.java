package com.project.report;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	private ExtentManager() {}

	private static ThreadLocal<ExtentTest> extText = new ThreadLocal<>();
	
	public static ExtentTest getExtentTest() {
		//return extText.get();
		ExtentTest a = extText.get();
		return a;
	}
	
	static void setExtentReport(ExtentTest test) {
		extText.set(test);
	}
	
	static void unload() {
		extText.remove();
	}
}
