package org.basePage.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.project.enums.WaitStrategy;
import org.projectFactories.com.ExplicitWaitFactory;
import org.projectName.com.DriverManager;

import com.project.report.Logger;

public class BasePage {   //common methods

	protected void type(By locator, String value, String elName, WaitStrategy wst) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(wst, locator);
		element.sendKeys(value);
		Logger.info("'" + value + "' is type in element '" + elName + "'.");
	}
	
	protected void clickOn(By locator, String elName, WaitStrategy wst) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(wst, locator);
		element.click();
		Logger.info("Click on '" + elName + "'.");
	}
	
	protected String getElementText(By locator, String elName, WaitStrategy wst) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(wst, locator);
		Logger.info("Text of '" + elName + "' is = '" + element.getText() + "'.");
		return element.getText();
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
	
	protected void mouseOver(WebElement element, String elName, WaitStrategy wst) {
		//Code
		Actions act = new Actions(DriverManager.getDriver());
		act.moveToElement(element);
		act.build().perform();
		Logger.info("Mouse over done on element '" + elName + "'");
	}
}
