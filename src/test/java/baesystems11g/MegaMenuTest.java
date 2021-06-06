package baesystems11g;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class MegaMenuTest extends BaseTest{
	
	@Test
	
	// Check 1st level menu item is clickable
	
	public void whatwedomenuitem () throws InterruptedException {
		
		driver.get("https://www.baesystems.com/en/home");
		
		Thread.sleep(2000);
		
		
		WebElement Firstmenu = driver.findElement(By.xpath ("//a[@class='top-level-navigation-link']"));
		
		// Mouse over on 'what we do'
		
		Actions objActions = new Actions (driver);
		
		objActions.moveToElement(Firstmenu);
		
		//Perfom
		
		objActions.build().perform();
		
		System.out.println("'What We Do' was mouse hovered");
		
		Firstmenu.click();
		
		System.out.println("'What We Do' was user clicked");
		
		String firstDestinationpage = driver.getCurrentUrl();
		
	  System.out.println(firstDestinationpage);
		
	}



}
