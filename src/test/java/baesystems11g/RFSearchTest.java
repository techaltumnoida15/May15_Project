package baesystems11g;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RFSearchTest extends BaseTest{


	@Test
	public void pagecheck() throws InterruptedException
	{ 
		
			/* Verify user is on desired site */

		
		String pageTitle = driver.getTitle();
			if (pageTitle.contains("BAE System"));
		
		System.out.println("You are on the correct page");
		
		
		String pgURL = driver.getCurrentUrl();
			System.out.println(pgURL);
		
		
				//Wait
				Thread.sleep(3000);
	

		/* Accept page cookies */
				
				driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
					System.out.println("Page cookies accepted");
				
				//Wait
				Thread.sleep(3000);
				
				/* Region dropdown opens */ 
				
				driver.findElement(By.xpath("//span[@class='js-dropdown-label']")).click();
				  System.out.println("International region dropdown was clicked");
			
		
	}	
	
}
	
	



