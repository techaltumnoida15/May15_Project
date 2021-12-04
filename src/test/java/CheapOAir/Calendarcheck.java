package CheapOAir;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.ClickAction;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

@Test
public class Calendarcheck extends BaseTest {

	public void calendarentry() {
		
		DriverManager.getDriver().navigate().to("https://www.cheapoair.com/");
		
		// click on Depart calendar entry
		
		DriverManager.getDriver().findElement(By.id("cal0")).click();
		
		System.out.println("Depart Calendar is open now");
		
		// Arrow to load next month 
		
		DriverManager.getDriver().findElement(By.xpath("//a[@aria-label='Select next month']//*[local-name()='svg']")).click();
		
		 System.out.println("Next set of calendar month loads");
	}
		

}

