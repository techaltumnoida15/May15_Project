package org.projectName.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	// Declare WebDriver
	protected WebDriver driver;
	//List<String> myList;

	@BeforeMethod
	public void openBrowser() throws Exception {
		String browserName = "CHROME";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//myList = new ArrayList<String>();
			
			//ChromeDriver chdr = new ChromeDriver();
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
	public void quitBrowser(ITestResult result) throws Exception {   //interface in TestNG are called as listeners
		if(!result.isSuccess()) {
			//Take Screenshot
			File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//TestCaseName_dd-MM-yyyy_hh-mm-ss.jpeg
			
			FileUtils.moveFile(srcScreenshot, new File("C:\\abc\\123.jpg"));
		}
		
		
		driver.quit();
	}
}
  



