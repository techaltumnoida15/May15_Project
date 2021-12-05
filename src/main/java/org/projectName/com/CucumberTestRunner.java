package org.projectName.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
		features = "src/test/java/org/features/com",      //path of fearure file
		glue = {"org.stepDefnition"},                                               //path of stepDefn
		tags = "",
		plugin = {"json:target/cucmber.json"},
		//dryRun = true
		monochrome = true

		)

public class CucumberTestRunner {

	private TestNGCucumberRunner testNGCucumberRunner; 
	

	@BeforeClass(alwaysRun = true)
	public void setupClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "Running Cucumber Scenarios", dataProvider = "features")
	public void feature(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideScenarios();
	}
	
	@AfterClass
	public void tearDown() {
		testNGCucumberRunner.finish();
	}
	
	@BeforeMethod
	public void openBrowser() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	public void quitBrowser() throws Exception {   //interface in TestNG are called as listeners
		//Driver.quitDriver();
	}
}
