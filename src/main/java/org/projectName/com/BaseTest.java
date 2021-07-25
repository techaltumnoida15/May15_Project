package org.projectName.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
	/*
	//@Parameters({"browserName", "osName"})
	@BeforeMethod
	public void openBrowser() throws Exception {
	String browserName = "CHROME";
		

		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome browser
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

		if(osName.equalsIgnoreCase("mac")) {
			//Safari

		}
		else {
			//Wins
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
		}
		}
		
		driver.manage().window().maximize();
		System.out.println("window maximized");


		//driver.get("https://www.facebook.com/login.php");
		 * 
		 * 
		 */
	@BeforeMethod
	public void openBrowser() throws Exception {
		Driver.initDriver();

	}

	@AfterMethod
	public void quitBrowser() throws Exception {   //interface in TestNG are called as listeners
		Driver.quitDriver();
	}
}
  



