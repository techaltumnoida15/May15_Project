package org.pageObject.com;

import java.util.List;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.DriverManager;
import org.testng.Assert;

import com.project.report.Logger;

public class HomePage extends BasePage{

	public HomePage() {}

	private By cssFromCity = By.cssSelector("#from0");
	private By cssToCity = By.cssSelector("#to0");
	private By cssSearcButton = By.cssSelector("#searchNow");
	private By cssClearFromCityTextBox = By.cssSelector("a[class*='suggestion-box__clear']");

	public HomePage enterFrom(String fromCity) {
		//Check if some text is present in FROM city

		String fromCityInTextBox = DriverManager.getDriver().findElement(cssFromCity).getAttribute("value");
		Logger.info("Already written FROM city is = " + fromCityInTextBox);

		if(fromCityInTextBox.isEmpty()) {
			type(cssFromCity, fromCity);
			Logger.info(fromCity + " is typed.");
		}
		else {
			clickOn(cssClearFromCityTextBox);
			Logger.info("From city text box is cleared.");
			
			type(cssFromCity, fromCity);
			Logger.info(fromCity + " is typed.");
		}

		//wait - so that suggestion box appear
		//waitForElementToBeVisible(cssClearFromCityTextBox);
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
		type(cssToCity, toCity);
		
		containsTextInAttribute(By.xpath("(//div[contains(@class, 'suggestion-box__')])[2]"), "class", "visible");
		
		//Handle suggestion box for TO city
		Assert.assertTrue(handleSuggestionBox(By.xpath("(//div[contains(@class, 'suggestion-box__')])[2]/ul"), toCity), "To city is not found in suggestion box.");
		return this;
	}

	public ListingPage clickOnSearch() {
		clickOn(cssSearcButton);

		return new ListingPage();
	}
	
	public HomePage selectDate() {
		//String dateToSelect = "15";  //15 Aug
		
		//Extract Date
		//When '15' found
		//Click on it
		
		//===========================
		String days = "+25";
		
		//Current Date + 25  => 2 Sept
		
		//Found current Month = Sept
		//Date Select
		
		
		//Click on Next -> until desired month appear
		// while loop
		//click -> check if month found
		//Select Datew
		//else -> click on next
		
		
		
		
		
		
		return this;
	}
}






