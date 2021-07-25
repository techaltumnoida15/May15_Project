package org.project.utilities;

import org.testng.annotations.DataProvider;

public class TestDataClassForDataProvoder {

	@DataProvider(name="testData")
	public static Object[][] getData() {   //Object is a super class also in JAVA; Object -> new ClassName()
		
		return new Object[][] {
			{"http://www.naukri.com", 1},
			{"http://www.gmail.com", 2.22}
		};
	}
}
