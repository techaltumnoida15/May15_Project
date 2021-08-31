package TrialDesignPattern;

import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

import designPatterns.BAEhomePage;

public class BAEhomePageTest extends BaseTest {

	
	@Test

	public void performSearch()  throws Exception {
		
		BAEhomePage baehomePage = new BAEhomePage();
		
		baehomePage
		  .waitForHomePageLoad()
		  .searchTopKeyword("typhoon");
		
		
		
	}

}