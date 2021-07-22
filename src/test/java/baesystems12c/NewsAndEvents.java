package baesystems12c;

import java.awt.Menu;
import java.awt.Taskbar.Feature;
import java.beans.EventSetDescriptor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class NewsAndEvents extends BaseTest {
	
	@Test
	public void NewsEvents() throws InterruptedException {
		
		// Navigate to the URL
		
		driver.navigate().to("http://dev.dotcom.baesystems.com/en/home");
		
		Thread.sleep(3000);
		
		// Click on news and events tab on the menu
		
		
		WebElement nWebElement = driver.findElement(By.xpath("(//a[@class='top-level-navigation-link'])[5]"));
				//nWebElement.click();
		
		//Mouse over on the 'News and Events'
		
		Actions objActions = new Actions (driver);
		
		objActions.moveToElement(nWebElement);
				
				System.out.println("News and Events SUB Menu expanded");
				
				//Click on SUB Menu item Features
				
				Thread.sleep(3000);
				
				   driver.findElement(By.xpath("//a[@class='second-level-navigation-link']")).click();
				
				System.out.println("Feature appears and clicked" );
				
				String submenuTitlElement = driver.getCurrentUrl();
				
				System.out.println("submenuTitlElement");
				
				
				
				
				
				
				
		
	}
	

 

	}

