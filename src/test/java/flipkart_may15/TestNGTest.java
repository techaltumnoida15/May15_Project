package flipkart_may15;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	
	
	@Test   //counted as 1 test
	public void test01() {
		System.out.println("Test01");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void beforeTetst() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

}










