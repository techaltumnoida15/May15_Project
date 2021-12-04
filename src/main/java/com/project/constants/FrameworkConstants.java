package com.project.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {}
	
	private static final String screenshotPath = System.getProperty("user.dir") + "\\screenshots\\failTests\\";
	private static final int maxRetryCount = 1;
	private static final String excelPath = System.getProperty("user.dir") + "\\resources//testData.xlsx";
	private static final String propertyFilePath = System.getProperty("user.dir") + "\\resources\\data.properties";
	

	public static String getPropertyfilepath() {
		return propertyFilePath;
	}

	public static String getExcelpath() {
		return excelPath;
	}

	public static int getMaxretrycount() {
		return maxRetryCount;
	}

	public static String getScreenshotPath() {
		return screenshotPath;
	}
}
