package baesystems11g;

import org.openqa.selenium.By;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;


public class BAESearch extends BaseTest {

@Test

	public void searchclick() {

		/* Mega menu Search icon is clicked */
	 
	driver.navigate().to("https://www.baesystems.com/en/home");

		DriverManager.getDriver().findElement(By.xpath("//*[@class=\"icon-search top-level-navigation-link desktop-content disable\"]"))
				.click();

		System.out.println("Search icon on the mega menu clicked to open the search text space");



//Type some item in search text box

		String topsearchItem = "typhoon";
		DriverManager.getDriver().findElement(By.xpath("//*[@id=\"SiteSearchDesktopForm\"]/input")).sendKeys(topsearchItem);

		System.out.println("Search keyword is typed");

		// Click on Search icon
		
		DriverManager.getDriver().findElement(By.xpath("//*[@id=\"SiteSearchDesktopForm\"]/button")).click();
		
		System.out.println("User is routed to the screach results page");
	}
}
