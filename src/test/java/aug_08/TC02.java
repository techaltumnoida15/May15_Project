package aug_08;

import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.project.report.ExtentManager;
import com.project.report.Logger;

public class TC02 extends BaseTest{

	@Test
	public void testCase02() {
		DriverManager.getDriver().get("http://www.google.com");
		String pageTitle = DriverManager.getDriver().getTitle();
		
		Logger.info("Page title is = " + pageTitle);
		Logger.pass("This test is pass.");
		Logger.fail("This test is fail.");
	}
}
