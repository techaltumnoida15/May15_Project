package designPatterns;

import java.sql.Driver;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pageObject.com.HomePage;
import org.pageObject.com.ListingPage;
import org.projectName.com.DriverManager;

import com.project.report.Logger;

public class BAEhomePage extends BasePage {
	

	private By searchIcon = By.xpath("//a[@class='icon-search top-level-navigation-link desktop-content disable']") ;
	
	private By searchBox = By.xpath("//*[@name='SiteSearchDesktopForm']/input");
	
	private By searchButton =By.xpath("//*[@name='SiteSearchDesktopForm']/button");
	
	
	
    
	// defining the constructor of the class to initialize he driver
	
	/*
	 * public BAEhomePage (WebDriver driver) {
	 * 
	 * searchIcon = (By) driver.findElement(By.
	 * xpath("//a[@class='icon-search top-level-navigation-link desktop-content disable']"
	 * ));
	 * 
	 * searchBox = (By)
	 * driver.findElement(By.xpath("//*[@name='SiteSearchDesktopForm']/input"));
	 * 
	 * searchButton = (By)
	 * driver.findElement(By.xpath("//*[@name='SiteSearchDesktopForm']/button"));
	 * 
	 * }
	 */
	
	public BAEhomePage waitForHomePageLoad() throws Exception {
		waitForPageLoad();
		Thread.sleep(1500);
		return this;
	}

		
	public ListingPage searchTopKeyword (String keyword) {
		clickOn(searchIcon);
		clickOn(searchBox);
		type(searchBox, keyword);
		clickOn(searchButton);
		
		//DriverManager.getDriver().findElement(By.xpath(""))
		Logger.info("You are routed to the search results page");
		
		return new ListingPage();
		
		
		
		
		
	}

}

