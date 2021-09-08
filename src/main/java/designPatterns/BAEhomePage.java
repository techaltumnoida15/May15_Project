package designPatterns;

import java.security.PublicKey;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.pageObject.com.HomePage;
import org.pageObject.com.ListingPage;
import org.project.enums.WaitStrategy;

import com.project.report.Logger;

public class BAEhomePage extends BasePage {
	
	
	public BAEhomePage() {}
	
	
	private By searchIcon = By.xpath("//a[@class='icon-search top-level-navigation-link desktop-content disable']") ;
	
	//private By searchBox = By.xpath("//*[@name='SiteSearchDesktopForm']/input");
	
	private By searchBox = By.xpath("//form[@name='SiteSearchDesktopForm']//input[@name='searchQuery']");
	
	private By searchButton =By.xpath("//*[@name='SiteSearchDesktopForm']/button");
	
	private By newsRoom = By.xpath("(//a[@class='top-level-navigation-link'])[4]");
	
	public BAEhomePage waitForHomePageLoad() throws Exception {
		waitForPageLoad();
		Thread.sleep(1500);
		return this;
	}
	 
// Test Case 1- Performing Search with keyword 'Typhoon'
		
	public ListingPage searchTopKeyword (String keyword) {
		
		clickOn(searchIcon, "Search Icon on Home page", WaitStrategy.VISIBLE);
		
		Logger.info(searchIcon + " Search icon is clicked.");
		
		clickOn(searchBox, "Search box on Home page", WaitStrategy.PRESENCE);
		
		Logger.info(searchBox + " Search box is clicked.");
		
		
		type(searchBox, keyword,"Search keyword is typed", WaitStrategy.NONE);
		
		Logger.info(keyword + " Typhoon is typed.");
		
		clickOn(searchButton, "Search button is clicked",WaitStrategy.VISIBLE);
		
		Logger.info("Search Button is clicked");
		
		return new ListingPage();
	}
		
	// Test Case 2-( 14 search logic )
		
	// News and Events Search
		
		public ListingPage ClickonNewsEvents() {
			
			clickOn(newsRoom, "News Room search", WaitStrategy.VISIBLE);
			
			Logger.info(newsRoom + " News Room item is clicked.");
			
			return new ListingPage();
		
		
	}

}

