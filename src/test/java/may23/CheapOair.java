package may23;

import java.awt.event.ActionEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CheapOair extends BaseTest {
	
	@Test
	
 public void fromWhere() throws Exception{
	 driver.navigate().to("https://www.cheapoair.com/");
	 Thread.sleep(3000);

	 //clear the suggestion text
	 
	 WebElement clearText =driver.findElement(By.xpath("//a[@class='suggestion-box__clear icon']"));
	 Assert.assertTrue(clearText.isDisplayed(), "suggestion is not present");
	 System.out.println("Clear the suggestion first then proceed");
	 clearText.click();
	 
	 Thread.sleep(3000);
	 
	 // Enter the Text in search From
	 
	WebElement FromTextBox = driver.findElement(By.xpath("//input[@aria-describedby='from0autoSuggestLabel']"));
	FromTextBox.click();
	System.out.println("focus is on From Text box");
	FromTextBox.sendKeys("Bos");
	Thread.sleep(5000);
	
	//get the suggestion values
	
	String Expected = "BOS - Boston Logan, Massachusetts, United States";
	
	 List<WebElement> SuggestionList = driver.findElement(By.xpath("//div[@class='suggestion-box__content air is-visible']")).findElements(By.tagName("li"));
	
	System.out.println("No of suggestions present " + SuggestionList.size());
	
	for (int i=0; i<SuggestionList.size(); i++) {
		String ActualText = SuggestionList.get(i).getText();
		System.out.println(ActualText);
		
		if (ActualText.equalsIgnoreCase(Expected))
		{
			SuggestionList.get(i).click();
			System.out.println("Expected text clicked");
			Thread.sleep(5000);
			break;			
		}
				}
	
	//Hover login link
	 WebElement SignLink = driver.findElement(By.xpath("//a[@title='Sign In']"));
	 
	// create a object of actions class
	 Actions obj = new Actions(driver);
	 obj.moveToElement(SignLink);
	 
	 //build and perform
	 
	 obj.build().perform();
	 Thread.sleep(5000);
		
	}
	
}