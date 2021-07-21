package may22;

import org.testng.annotations.DataProvider;

public class DataProviderUtility {

	/*
	@DataProvider(name = "DataProvider1")
	public Object[][] getData() {

		/*
		Object[][] testData = new Object[][] {
			
			{ "http://www.flipkart.com", 23525252, "255.24", 85.4},
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
		
		
		//Data From Excel
	//}
	*/

	
	@DataProvider
	public String[] getData() {
		String[] testData = { "http://www.amzon.com", "button[id='_2KpZ6l _16166161']", "aabb"};
		
		
		return testData;
	}

}
