package baesystems11g;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class MegaMenuTest extends BaseTest{
	
	@Test
	
	// Check 1st level menu item is clickable
	
	public void whatwedomenuitem () throws InterruptedException {
		
		DriverManager.getDriver().get("https://www.baesystems.com/en/home");
		
		Thread.sleep(2000);
		
		
		WebElement Firstmenu = DriverManager.getDriver().findElement(By.xpath ("//a[@class='top-level-navigation-link']"));
		
		// Mouse over on 'what we do'
		
		Actions objActions = new Actions (DriverManager.getDriver());
		
		objActions.moveToElement(Firstmenu);
		
		//Perfom
		
		objActions.build().perform();
		
		System.out.println("'What We Do' was mouse hovered");
		
		Firstmenu.click();
		
		System.out.println("'What We Do' was user clicked");
		
		String firstDestinationpage = DriverManager.getDriver().getCurrentUrl();
		
	  System.out.println(firstDestinationpage);
		
	}



}
