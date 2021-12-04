package TrialDesignPattern;

import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

import designPatterns.BAEhomeEditorial;

public class BAEhomeEditorialLoginTest extends BaseTest {

	
	@Test

	public void editorialLogin()  throws Exception {
		
		BAEhomeEditorial baehomeEditorialPage = new BAEhomeEditorial();
		
		baehomeEditorialPage
		
		.changeUrlBaEhomeEditorial()
		.enterusername("Bharti")
		.enterpassword("Bharti")
		.Submit();
		
      
		
		
	}

}