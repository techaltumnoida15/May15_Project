package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class COA_RadioButton extends BaseTest{

	@Test
	public void coaTestRadioButton() throws Exception {
		driver.get("http://www.cheapoair.com");
		
		Thread.sleep(4000);   //
		
		//Check id Round Trip is selected or not
		Assert.assertTrue(driver.findElement(By.id("roundTrip")).isSelected(), "Round trip is not selected.");
		System.out.println("Round trip is selected.");
		
		Assert.assertTrue(!driver.findElement(By.id("onewayTrip")).isSelected(), "OneWay trip is selected.");
		System.out.println("OneWay trip is not selected.");
		
		/*
		 * WebElement oneWay = driver.findElement(By.id("onewayTrip")); Boolean
		 * isOneWaySelected = oneWay.isSelected();
		 * 
		 * if(isOneWaySelected) { System.out.println("One way is selected."); } else {
		 * System.out.println("One way is not selected."); }
		 */
	}
}
