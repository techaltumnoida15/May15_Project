package designPatterns;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pageObject.com.HomePage;
import org.pageObject.com.ListingPage;

import com.project.report.Logger;

public class BAEhomePagepageFactory extends BasePage {
	
	private static final String typhoon = null;

	private By searchIcon;
	
	private By searchBox;
	
	private By searchButton;
	
    
	// defining the constructor of the class to initialize he driver
	
	public BAEhomePagepageFactory (WebDriver driver) {
		
		searchIcon = (By) driver.findElement(By.xpath("//a[@class='icon-search top-level-navigation-link desktop-content disable']"));
		
		searchBox  = (By) driver.findElement(By.xpath("//*[@name='SiteSearchDesktopForm']/input"));
		
		searchButton = (By) driver.findElement(By.xpath("//*[@name='SiteSearchDesktopForm']/button"));
		
	}
	
	public BAEhomePagepageFactory waitForHomePageLoad() throws Exception {
		waitForPageLoad();
		Thread.sleep(1500);
		return this;
	}

		
	public ListingPage searchTopKeyword (String keyword) {
		clickOn(searchIcon);
		clickOn(searchBox);
		type(searchBox, keyword);
		clickOn(searchButton);

		Logger.info("You are routed to the search results page");
		
		return new ListingPage();
		
		
		
	}

}

