package baesystems11g;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class RFSearchTest extends BaseTest {

	@Test
	public void pagecheck() throws InterruptedException {

		/* Verify user is on desired site */
		
		DriverManager.getDriver().get("http://dev.dotcom.baesystems.com/en/home");


		String pageTitle = DriverManager.getDriver().getTitle();
		if (pageTitle.contains("BAE System"))
			;


		System.out.println("You are on the correct page");

		String pgURL = DriverManager.getDriver().getCurrentUrl();
		System.out.println(pgURL);

		// Wait
		Thread.sleep(3000);

		/* Accept page cookies */

		DriverManager.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		System.out.println("Page cookies accepted");

		// Wait
		Thread.sleep(3000);

		/* Region dropdown opens */

		DriverManager.getDriver().findElement(By.xpath("//span[@class='js-dropdown-label']")).click();
		System.out.println("International region dropdown was clicked and gets open");

		/* Navigate to us region */

		// Wait
		Thread.sleep(3000);

		//WebElement uSRegionElement = DriverManager.getDriver().findElement(By.xpath("//li[@class='region-selector__item'])[2]/a"));

		WebElement uSRegionElement =
		 DriverManager.getDriver().findElement(By.xpath("//*[@id=\"select-region-lang\"]/ul/li[3]/a"));

		uSRegionElement.click();

		System.out.println("Navigate to US region");

		System.out.println("You are routed to US Region of BAE site");

	}

}
