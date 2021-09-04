package org.pageObject.com;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.project.enums.WaitStrategy;
import org.projectName.com.DriverManager;

public class BAE_HomePage extends BasePage{

	private By searchIcon = By.cssSelector("a[class='icon-search top-level-navigation-link desktop-content disable']");
	
	public BAE_HomePage doMouseOverOnSearchIcon() {
		
		WebElement element = DriverManager.getDriver().findElement(searchIcon);
		mouseOver(element, "Search Icon", WaitStrategy.VISIBLE);
		
		return this;
		//return new BAE_HomePage();
	}
	
	public BAE_HomePage enterSearchString(String searchString) {
		clickOn(By.cssSelector("#SiteSearchDesktopForm input"), "Search Strip", WaitStrategy.NONE);
		
		type(By.cssSelector("#SiteSearchDesktopForm input"), searchString, "Text Box - Search", WaitStrategy.VISIBLE);
		
		return this;
	}
	
}
