package org.projectName.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	// Declare WebDriver
	protected WebDriver driver;

	@BeforeMethod
	public void openBrowser() throws Exception {
		String browserName = "CHROME";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//Open FF
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			//Open IE
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			throw new Exception("This browser is not mention.");
		}
		
		driver.manage().window().maximize();
		System.out.println("window maximized");


		//driver.get("https://www.facebook.com/login.php");

	}

	@AfterMethod
	public void quitBrowser() {
		
		/*
		 * TestClassDemo obj = new TestClassDemo(); int s = obj.a;
		 * 
		 * obj.method1();
		 */
		
		
		System.out.println("window close");
		driver.quit();
	}

}
  



