package may22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class MouseOverTest extends BaseTest{

	@Test
	public void  mouseOverTest() {
		//driver.get("http://www.naukri.com"); 
		
		driver.navigate().to("http://www.naukri.com");
		
		//Tech - No difference
		//Find More element
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		//Mouse Over - More
		Actions obj = new Actions(driver);
		obj.moveToElement(more);
		//Do something
		obj.build().perform();      //using 'Actions' class
		
		/*
		 * Actions class create small chains of actions
		 * build all the actions and then perform them together.
		 */
		
		//Click on Naukri Blog
		WebElement naukriBlog = driver.findElement(By.xpath("//a[contains(text(),'Naukri Blog')]"));
		naukriBlog.click();
	}	
}
