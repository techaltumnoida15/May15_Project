package may22;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


	@Test(dataProvider = "DataProvider1", dataProviderClass = may22.DataProviderUtility.class)
	public void testCase01(String url, String locator, String a ) {
		//Code
		System.out.println("url = " + url);
		System.out.println("locator = " + locator);
		System.out.println("a = " + a);
	}

	//Get URL


	/*
	@DataProvider(name = "DataProvider1")
	public Object[][] getData() {

		
		Object[][] testData = new Object[][] {
			
			{ "http://www.flipkart.com", "button[class='_2KpZ6l _2doB4z']", "abc"},
			{ "http://www.amzon.com", "button[id='_2KpZ6l _16166161']", "aabb"},
		};
		*/
	/*
		Object[][] testData = new Object[2][3];
		
		testData[0][0] = "http://www.flipkart.com";
		testData[0][1] = "button[class='_2KpZ6l _2doB4z']";
		testData[0][2] = "abc";
		
		
		testData[1][0] = "http://www.amzon.com";
		testData[1][1] = "button[id='_2KpZ6l _16166161']";
		testData[1][2] = "aabb";

		return testData;
	}
*/
}
