package org.pageObject.com;

import java.time.LocalDateTime;
import java.util.List;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.project.enums.WaitStrategy;
import org.projectName.com.DriverManager;
import org.testng.Assert;

import com.project.report.ExtentManager;
import com.project.report.Logger;

public class HomePage extends BasePage{

	//public HomePage() {}

	private By cssFromCity = By.cssSelector("#from0");
	private By cssToCity = By.cssSelector("#to0");
	private By cssSearcButton = By.cssSelector("#searchNow");
	private By cssClearFromCityTextBox = By.cssSelector("a[class*='suggestion-box__clear']");
	private By cssDepartDateCal = By.cssSelector("div[class*='calendarDepart']");

	public HomePage enterFrom(String fromCity) {
		//Check if some text is present in FROM city

		String fromCityInTextBox = DriverManager.getDriver().findElement(cssFromCity).getAttribute("value");
		Logger.info("Already written FROM city is = " + fromCityInTextBox);

		if(fromCityInTextBox.isEmpty()) {
			type(cssFromCity, fromCity, "From City", WaitStrategy.NONE);
			Logger.info(fromCity + " is typed.");
		}
		else {
			clickOn(cssClearFromCityTextBox, "abc", WaitStrategy.PRESENCE);
			Logger.info("From city text box is cleared.");

			type(cssFromCity, fromCity, "From City", WaitStrategy.NONE);
			Logger.info(fromCity + " is typed.");
		}
		containsTextInAttribute(By.cssSelector("div[class*='suggestion-box__']"), "class", "visible");

		//Handle ASuestion Box
		Assert.assertTrue(handleSuggestionBox(By.cssSelector("div[class*='suggestion-box__'] > ul"), fromCity), "From city is not found in suggestion box.");

		return this;
		//return new HomePage();
	}

	private boolean handleSuggestionBox(By locator, String fromCity) {
		boolean isCityFound = false;
		List<WebElement> suggestionBoxElements = DriverManager.getDriver().findElement(locator).findElements(By.tagName("li"));
		Logger.info("Total suggestions are = " + suggestionBoxElements.size());

		for(int i = 0; i<suggestionBoxElements.size(); i++) {
			if(suggestionBoxElements.get(i).getText().contains(fromCity)) {
				//Click
				suggestionBoxElements.get(i).click();
				isCityFound = true;
				Logger.info("Click on " + fromCity + "in suggestion box");
				break;
			}
		}
		if(isCityFound)
			return true;
		else
			return false;
	}

	public HomePage waitForHomePageLoad() throws Exception {
		waitForPageLoad();
		Thread.sleep(1500);
		return this;
	}

	public HomePage enterTo(String toCity) {
		type(cssToCity, toCity, "To City", WaitStrategy.NONE);

		containsTextInAttribute(By.xpath("(//div[contains(@class, 'suggestion-box__')])[2]"), "class", "visible");

		//Handle suggestion box for TO city
		Assert.assertTrue(handleSuggestionBox(By.xpath("(//div[contains(@class, 'suggestion-box__')])[2]/ul"), toCity), "To city is not found in suggestion box.");
		return this;
	}

	public ListingPage clickOnSearch() {
		clickOn(cssSearcButton, "Search button on Home page", WaitStrategy.VISIBLE);
		return new ListingPage();
	}

	public HomePage selectDate(int departDateToSelect) {
		//int departDateToSelect = 35;  // Current Date + 15 Days => Date - Select, SysMonth, Year
		String currentSysMonthAfterAddDays = LocalDateTime.now().plusDays(departDateToSelect).getMonth().toString().toLowerCase();
		Logger.info("currentSysMonthAfterAddDays = " + currentSysMonthAfterAddDays);

		//Click on cal
		clickOn(cssDepartDateCal, "Depart Date Cal", WaitStrategy.NONE);

		//Get current cal month
		String currentMonthTextInCal = getElementText(By.cssSelector("div[class='calendar__wrapper clearfix'] > div > div"), "Current Month in Cal", WaitStrategy.NONE);
		Logger.info("currentMonthTextInCal = " + currentMonthTextInCal);

		if(currentMonthTextInCal.toLowerCase().contains(currentSysMonthAfterAddDays)) {
			Logger.info("Need to select date from current month in cal");
			selectDateFromCal(departDateToSelect);
		}
		else {
			Logger.info("In else");

			//Click on Next
			//clickOn(By.cssSelector("a[class='calendar-nav__next icon  rightNav']"), "Next Button in Cal", WaitStrategy.CLICKABLE);

			//Use JavaScript to communicate with any WebElement
			Boolean isDesiredMonthFound = false;
			int counter = 2;

			while(!isDesiredMonthFound) {
				//click on Next
				((JavascriptExecutor)DriverManager.getDriver()).executeScript("document.getElementsByClassName('calendar-nav__next icon  rightNav')[0].click()");
				Logger.info("Click on Next.");

				String currentMonthText = "div[class='calendar__wrapper clearfix'] > div:nth-child(" + counter + ") > div";
				counter++;

				currentMonthTextInCal = getElementText(By.cssSelector(currentMonthText), "Current Month in Cal", WaitStrategy.VISIBLE);
				Logger.info("currentMonthTextInCal = " + currentMonthTextInCal);

				if(currentMonthTextInCal.toLowerCase().contains(currentSysMonthAfterAddDays)) {
					Logger.info("Need to select date from current month in cal");
					selectDateFromCal(departDateToSelect);
					isDesiredMonthFound = true;
					Logger.info("Desired month comes up - " + currentMonthTextInCal);
					break;
				}
			}
		}
		return this;
	}

	private void selectDateFromCal(Integer dateToSelect) {
		String date = dateToSelect.toString();

		//Extract Date  => String

		//If(dateInCal.equals(dateToSelect)) ==> click()
		//break;


	}
}






