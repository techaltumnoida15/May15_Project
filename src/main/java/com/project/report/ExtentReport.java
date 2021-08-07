package com.project.report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {
	private ExtentReport() {}

	private static ExtentReports extent;
	private static ExtentTest test;

	public static void initReport() {

		/*
		 * if(extent == null) {
		 * 
		 * }
		 */

		if(Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");

			extent.attachReporter(spark);

			//Config
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("Selenium Automation Report");
			spark.config().setReportName("ProjectName UI Test Automation");
			//spark.config().
		}
	}

	public static void tearDownReport() throws IOException {
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
		ExtentManager.unload();

		//Open report in system default browser after finish
		Desktop.getDesktop().browse(new File("index.html").toURI());
	}

	public static void createTests(String testName) throws IOException {
		test = extent.createTest(testName);
		ExtentManager.setExtentReport(test);
		
	}

}
