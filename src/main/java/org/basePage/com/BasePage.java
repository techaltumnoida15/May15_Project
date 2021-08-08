package org.basePage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.projectName.com.DriverManager;

import com.project.report.Logger;

public class BasePage {   //common methods

	protected void type(By locator, String value) {
		DriverManager.getDriver().findElement(locator).sendKeys(value);
		Logger.info(value + " is typed.");
	}
	
	protected void clickOn(By locator) {
		DriverManager.getDriver().findElement(locator).click();
		Logger.info("Clicked.");
	}
	
	protected void waitForElementToBeVisible(By locator) {
		new WebDriverWait(DriverManager.getDriver(), 10)
		.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	protected void containsTextInAttribute(By locator, String attribute, String value) {
		new WebDriverWait(DriverManager.getDriver(), 10)
		.until(ExpectedConditions.attributeContains(locator, attribute, value));
	}
	
	protected void waitForPageLoad() {
		new WebDriverWait(DriverManager.getDriver(), 10)
		.until(d -> ((JavascriptExecutor)DriverManager.getDriver()).executeScript("return document.readyState").equals("complete"));
	}
	
	protected String pageCurrentURL() {
		return DriverManager.getDriver().getCurrentUrl();
	}
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
