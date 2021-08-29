package org.homePageTest.com;

import org.pageObject.com.HomePage;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class RoundTripSearchTest extends BaseTest{

	@Test
	public void roundTripSearchTest() throws Exception {
		HomePage homePage = new HomePage();
		
		homePage
		.waitForHomePageLoad()
		.enterFrom("NYC")
		.enterTo("LAS")
		.selectDate(10)
		.clickOnSearch();
		
	}
}
