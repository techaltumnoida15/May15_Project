package org.stepDefnition;

import org.pageObject.com.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefn {
	
	HomePage homePage;
	
	public HomePageStepDefn() {
		homePage = new HomePage();
	}

	@Given("User is on homepage")
	public void user_is_on_homepage() throws Exception {
		homePage.waitForHomePageLoad();
		System.out.println("User is on homepage - Done");
	}

	@Then("User select roundTrip")
	public void user_select_round_trip() {
		//Write code for that
		System.out.println("Round trip is selected.");
	}

	@Then("User enter from {string}")
	public void user_enter_from(String fromCity) {
		System.out.println("fromCity is = " + fromCity);
		homePage.enterFrom(fromCity);
	}

	@Then("User enter to {string}")
	public void user_enter_to(String toCity) {
		System.out.println("toCity is = " + toCity);
		homePage.enterTo(toCity);
	}

	@Then("select depart date {string}")
	public void select_depart_date(String departDate) {
		System.out.println("select depart date - Done. " + departDate);
	}

	@Then("select return date {string}")
	public void select_return_date(String returnDate) {
		System.out.println("select return date - Done. " + returnDate);
	}

	@Then("Click on Search")
	public void click_on_search() {
		System.out.println("Click on Search - Done");
	}

	@Then("Listing page should open")
	public void listing_page_should_open() {
		System.out.println("Listing page open - Done.");
	}
	
}
