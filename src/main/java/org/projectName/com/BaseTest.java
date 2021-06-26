package org.projectName.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	//@Parameters({"browserName", "osName"})
	@BeforeMethod
	public void openBrowser() throws Exception {
		Driver.initDriver();

	}

	@AfterMethod
	public void quitBrowser() throws Exception {   //interface in TestNG are called as listeners
		Driver.quitDriver();
	}
}
  



