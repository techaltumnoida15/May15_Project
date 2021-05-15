package org.projectName.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	// Declare WebDriver
	protected WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		// BrowserDriver.exe
		WebDriverManager.chromedriver().setup();
		// Open Browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.flipkart.com");
	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

}
