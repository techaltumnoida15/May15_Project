package baesystems12c;

import org.openqa.selenium.By;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;


public class BAESearch_12c extends BaseTest {

@Test

	public void searchclick() throws InterruptedException {

		/* Mega menu Search icon is clicked */
	 
	driver.navigate().to("http://dev.dotcom.baesystems.com/en/home");

		driver.findElement(By.xpath("//a[@class='icon-search top-level-navigation-link desktop-content disable']"))
				.click();
		

		System.out.println("Search icon on the mega menu clicked to open the search text space");

        Thread.sleep(3000);

//Type some item in search text box

		String topsearchItem = "typhoon";
		//driver.findElement(By.xpath("//*[@id=\"SiteSearchDesktopForm\"]/input")).sendKeys(topsearchItem);
		
		driver.findElement(By.xpath("//*[@name='SiteSearchDesktopForm']/input")).sendKeys(topsearchItem);
		
		//driver.findElement(By.name("searchQuery")).sendKeys(topsearchItem);

		System.out.println("Search keyword is typed");

		// Click on Search icon
		
		driver.findElement(By.xpath("//*[@name='SiteSearchDesktopForm']/button")).click();
		
		System.out.println("User is routed to the screach results page");
	}
}
