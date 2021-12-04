package org.stepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDefn {

	WebDriver driver;
	HomePage homePage;
	
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		homePage = new HomePage(driver);
	}
	
	@After
	public void quitBrowswer() {
		driver.quit();
	}
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    //System.out.println("User is hon home page - Done");
	}

	@Then("User select oneway")
	public void user_select_oneway() {
	    //System.out.println("User select One way - Done");
	}

	@Then("User enter from")
	public void user_enter_from() {
		homePage.enterFrom("NYC");
	}
	
	@Then("User enter from {string}")
	public void user_enter_from(String fromCity) {
		homePage.enterFrom(fromCity);
	}


	@Then("User enter to")
	public void user_enter_to() {
		homePage.enterTo("LAS");
	}

	@Then("select depart date")
	public void select_depart_date() {
	    
	}

	@Then("Click on Search")
	public void click_on_search() {
	    
	}

	@Then("Listing page should open")
	public void listing_page_should_open() {
	    
	}
	
	@Then("User select roundTrip")
	public void user_select_round_trip() {
	}

	@Then("User enter to {string}")
	public void user_enter_to(String string) {
	}

	@Then("select depart date {string}")
	public void select_depart_date(String string) {
	}
	
	@Then("select return date {string}")
	public void select_return_date(String string) {
	}
}
