package org.projectFactories.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.project.enums.WaitStrategy;
import org.projectName.com.DriverManager;

public final class ExplicitWaitFactory {

	private ExplicitWaitFactory() {}

		public static WebElement performExplicitWait(WaitStrategy waitstrategy, By by) {
			WebElement element = null;
			if(waitstrategy == WaitStrategy.CLICKABLE) {
				element = 	new WebDriverWait(DriverManager.getDriver(), 10)
						.until(ExpectedConditions.elementToBeClickable(by));
			}
			else if(waitstrategy == WaitStrategy.PRESENCE) {
				element =	new WebDriverWait(DriverManager.getDriver(), 10)
						.until(ExpectedConditions.presenceOfElementLocated(by));
			}
			else if(waitstrategy == WaitStrategy.VISIBLE) {
				element =new WebDriverWait(DriverManager.getDriver(), 10)
						.until(ExpectedConditions.visibilityOfElementLocated(by));
			}
			else if(waitstrategy == WaitStrategy.NONE) {
				element = DriverManager.getDriver().findElement(by);
			}
			return element;
		}
}
