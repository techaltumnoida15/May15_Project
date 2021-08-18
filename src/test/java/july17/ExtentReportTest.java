package july17;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {

	//Classes - POI, Extent Report
	@Test
	public void extentReportTest() throws IOException {
		
		//init
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		
		extent.attachReporter(spark);
		
		
		//Config
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Selenium Automation Report");
		spark.config().setReportName("ProjectName UI Test Automation");
		
		
		//Test
		ExtentTest test1 = extent.createTest("Test Case 1");
		test1.pass("Test 01 is pass.");
		
		ExtentTest test2 = extent.createTest("Test Case 12");
		test2.pass("Test 02 is pass.");
		
		
		//TearDown
		extent.flush();
		
		//Open report in system default browser after finish
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}
	
}
