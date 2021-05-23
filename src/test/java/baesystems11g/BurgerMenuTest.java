package baesystems11g;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class BurgerMenuTest extends BaseTest {
	
	@Test
	public void burgermenulist () {
	
		// Navigate to the URL
		
		driver.navigate().to("http://baesystems.com/en/home");
		
		// Find burger Menu Element
		
		WebElement bMElement =  driver.findElement(By.xpath("//a[@class='top-level-navigation-link disable']"));
		
		//Mouse over on the Burger Menu
		
		Actions objActions = new Actions(driver);
		objActions.moveToElement(bMElement);
		
		//Performing actions
		
		objActions.build().perform();
		
		
		//Click to the first level navigation 'Our Company
		
		WebElement ourCompany = driver.findElement(By.xpath("//span[text()='Our Company']"));
		
		// Mouse over on Our company 
		
		Actions objActions2 = new Actions(driver);
		objActions2.moveToElement(ourCompany);
		
		//Performing actions
		
		objActions2.build().perform();
		
		//Click on the 'Our Company' link
		
		ourCompany.click();
		
		
		
	


}
}
