package com.project.report;

public final class Logger {

	private Logger() {}
	
	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
		
		//ExtentManager.getExtentTest().
	}
	
	public static void fail(String message) {
		ExtentManager.getExtentTest().fail(message);
	}
	
	public static void skip(String message) {
		ExtentManager.getExtentTest().skip(message);
	}
	
	public static void info(String message) {
		ExtentManager.getExtentTest().info(message);
	}
}
