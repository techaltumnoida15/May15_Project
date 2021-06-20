package flipkart_may15;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
}
