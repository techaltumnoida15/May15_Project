package org.projectName.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	// Declare WebDriver
	protected WebDriver driver;
	//List<String> myList;

	@Parameters({"browserName"})
	@BeforeMethod
	public void openBrowser(String browserName) throws Exception {
		
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

		else if(browserName.equalsIgnoreCase("edge")) {
			//Open Edge
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("This browser is not mention.");
		}
		//}
		driver.manage().window().maximize();
		System.out.println("window maximized");


		//driver.get("https://www.baesystems.com/en/home");

	}

	@AfterMethod
	public void quitBrowser(ITestResult result) throws Exception {   //interface in TestNG are called as listeners
		/*
		 * if(!result.isSuccess()) { //Take Screenshot File srcScreenshot =
		 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * //TestCaseName_dd-MM-yyyy_hh-mm-ss.jpeg
		 * 
		 * FileUtils.moveFile(srcScreenshot, new File("C:\\abc\\123.jpg")); }
		 */


		driver.quit();
	}
}




