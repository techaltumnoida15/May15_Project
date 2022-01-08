package org.projectName.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.project.enums.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {}

	private static WebDriver driver;

	public static void initDriver() throws Exception {
		String browserName = "firefox";
		String osName = "WINS";

		if(DriverManager.getDriver() == null) {

			//Wins
			//if(browserName.equalsIgnoreCase("chrome")) {
			if(browserName.equalsIgnoreCase(Browser.CHROME.name())) {
				//Open Chrome
				WebDriverManager.chromedriver().setup();

				//ChromeOptions chromeOptions = new ChromeOptions();
				//chromeOptions.setHeadless(true);

				//driver = new ChromeDriver(chromeOptions);
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
		}
		
		DriverManager.setWebDriver(driver);
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get("http://www.cheapoair.com");
		
	}

	public static void quitDriver() {
		if(DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
