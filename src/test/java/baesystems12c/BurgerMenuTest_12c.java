package baesystems12c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class BurgerMenuTest_12c extends BaseTest {
	
	@Test
	public void burgermenulist () {
	
		// Navigate to the URL
		
		DriverManager.getDriver().navigate().to("http://baesystems.com/en/home");
		
		// Find burger Menu Element
		
		WebElement bMElement =  DriverManager.getDriver().findElement(By.xpath("//a[@class='top-level-navigation-link disable']"));
		
		//Mouse over on the Burger Menu
		
		WebDriver driver = null;
		Actions objActions = new Actions(driver);
		objActions.moveToElement(bMElement);
		
		//Performing actions
		
		objActions.build().perform();
		
		
		//Find the first level navigation item 'Our Company
		
		WebElement ourCompany = DriverManager.getDriver().findElement(By.xpath("//span[text()='Our Company']"));
		
		// Mouse over on Our company 
		
		Actions objActions2 = new Actions(driver);
		objActions2.moveToElement(ourCompany);
		
		//Performing actions
		
		objActions2.build().perform();
		
		System.out.println("first level item - Our Company is traceable");
		
		//Click on the 'Our Company' link
		
		ourCompany.click();
			
		System.out.println("You are on destination URL -Our company page");
		
		//fetch and print the Destination page URL
		
		
		String DestinationURL = DriverManager.getDriver().getCurrentUrl();
		
		
		System.out.println(DestinationURL);
			
		
		//DriverManager.getDriver().navigate().back();

		
		
		
		
	


}
}
