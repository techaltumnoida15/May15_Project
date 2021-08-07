package org.pageObject.com;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.projectName.com.DriverManager;

import com.project.report.Logger;

public class HomePage extends BasePage{

	public void homePage() {}
		
	private By cssFromCity = By.cssSelector("#from0");
	private By cssToCity = By.cssSelector("#from0");
	private By cssSearcButton = By.cssSelector("#searchNow");
	
	public HomePage enterFrom(String fromCity) {
		//DriverManager.getDriver().findElement(By.cssSelector("#from0")).sendKeys("NYC");
		type(cssFromCity, fromCity);
		Logger.info("From Cijty is entered - " + fromCity);
		return this;
		//return new HomePage();
	}
	
	public HomePage enterTo(String toCity) {
		//DriverManager.getDriver().findElement(By.cssSelector("")).sendKeys("");
		type(cssToCity, toCity);
		return this;
	}
	
	public ListingPage clickOnSearc() {
		//DriverManager.getDriver().findElement(By.cssSelector("")).click();
		clickOn(cssSearcButton);
		
		return new ListingPage();
	}
}
