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
	}

	@Then("User select roundTrip")
	public void user_select_round_trip() {
		//Write code for that
		System.out.println("Round trip is selected.");
	}

	@Then("User enter from {string}")
	public void user_enter_from(String fromCity) {
		homePage.enterFrom(fromCity);
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

	@Then("Click on Search")
	public void click_on_search() {
	}

	@Then("Listing page should open")
	public void listing_page_should_open() {
	}
	
}
