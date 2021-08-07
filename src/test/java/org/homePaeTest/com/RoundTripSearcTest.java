package org.homePaeTest.com;

import org.pageObject.com.HomePage;
import org.testng.annotations.Test;

public class RoundTripSearcTest {

	@Test
	public void roundTripSearcTest() {
		HomePage homePage = new HomePage();
		
		homePage
		.enterFrom("NYC")
		.enterTo("LAS")
		.clickOnSearc();
		
	}
}
