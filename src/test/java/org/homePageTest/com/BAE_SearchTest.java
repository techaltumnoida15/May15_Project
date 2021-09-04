package org.homePageTest.com;

import org.pageObject.com.BAE_HomePage;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class BAE_SearchTest extends BaseTest{

	@Test
	public void baeSearchTest() {
		BAE_HomePage homePage = new BAE_HomePage();
		
		homePage
		.doMouseOverOnSearchIcon()
		.enterSearchString("ABCD");
		
	}
}
