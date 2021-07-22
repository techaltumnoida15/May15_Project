package july17;

import org.testng.annotations.Test;

public class DataProviderTestCase {

	@Test(dataProvider = "testData", dataProviderClass = TestDataClassForDataProvoder.class)
	public void testCase02(Object aa, Object bb) {
		
		
		System.out.println("aa = " + aa);
		System.out.println("bb = " + bb);
	}
}
