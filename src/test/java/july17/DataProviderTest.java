package july17;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "testData", dataProviderClass = TestDataClassForDataProvoder.class)
	public void testCase01(Object a, Object b) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	
	
}