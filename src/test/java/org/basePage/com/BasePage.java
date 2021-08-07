package org.basePage.com;

import org.openqa.selenium.By;
import org.projectName.com.DriverManager;

public class BasePage {

	protected void type(By locator, String value) {
		DriverManager.getDriver().findElement(locator).sendKeys(value);
	}
	
	protected void clickOn(By locator) {
		DriverManager.getDriver().findElement(locator).click();
	}
	
}
