package aug_08;

import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

import com.project.report.ExtentManager;
import com.project.report.Logger;

public class TC01 extends BaseTest{

	@Test
	public void testCase01() {
		DriverManager.getDriver().get("http://www.cheapoair.com");
		String pageTitle = DriverManager.getDriver().getTitle();
		
		/*
		 * ExtentManager.getExtentTest().info("Page title is = " + pageTitle);
		 * ExtentManager.getExtentTest().pass("This test is pass.");
		 * ExtentManager.getExtentTest().fail("This test is fail.");
		 * ExtentManager.getExtentTest().log(Status.FAIL, "Thi is an info");
		 */
	
		//ExtentManager.getExtentTest().
		
		Logger.info("Page title is = " + pageTitle);
		Logger.pass("This test is pass.");
		Logger.fail("This test is fail.");
		//Logger.log(Status.FAIL, "Thi is an info");
	
	}
}
