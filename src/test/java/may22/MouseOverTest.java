package may22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class MouseOverTest extends BaseTest{

	@Test
	public void  mouseOverTest() {
		//DriverManager.getDriver().get("http://www.naukri.com"); 
		
		DriverManager.getDriver().navigate().to("http://www.naukri.com");
		
		//Tech - No difference
		//Find More element
		WebElement more = DriverManager.getDriver().findElement(By.xpath("//div[text()='More']"));
		
		//Mouse Over - More
		Actions obj = new Actions(DriverManager.getDriver());
		obj.moveToElement(more);
		//Do something
		obj.build().perform();      //using 'Actions' class
		
		/*
		 * Actions class create small chains of actions
		 * build all the actions and then perform them together.
		 */
		
		//Click on Naukri Blog
		WebElement naukriBlog = DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Naukri Blog')]"));
		naukriBlog.click();
	}	
}
