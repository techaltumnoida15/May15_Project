package org.projectName.com;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {}
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static void setWebDriver(WebDriver drRef) {
		dr.set(drRef);
	}
	
	public static void unload() {
		dr.remove();
	}
}
