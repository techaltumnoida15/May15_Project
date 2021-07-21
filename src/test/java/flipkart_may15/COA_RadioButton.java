package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class COA_RadioButton extends BaseTest{

	@Test
	public void coaTestRadioButton() throws Exception {
		//DriverManager.getDriver().get("http://www.cheapoair.com");
		DriverManager.getDriver().navigate().to("http://www.cheapoair.com");
		
		DriverManager.getDriver().getTitle();
		Thread.sleep(4000);   //
		
		//DriverManager.getDriver().
		
		//Check id Round Trip is selected or not
		Assert.assertTrue(DriverManager.getDriver().findElement(By.id("roundTrip")).isSelected(), "Round trip is not selected.");
		System.out.println("Round trip is selected.");
		
		WebElement RadioOnwayTrip =DriverManager.getDriver().findElement(By.id("onewayTrip"));
		boolean IsRadio = RadioOnwayTrip.isSelected();
		System.out.println("radio buton is " + IsRadio);
		
		Assert.assertTrue(!DriverManager.getDriver().findElement(By.id("onewayTrip")).isSelected(), "OneWay trip is selected.");
		System.out.println("OneWay trip is not selected.");
		
		//To select ONEWAY  
		WebElement oneWay = DriverManager.getDriver().findElement(By.cssSelector("label[for='onewayTrip']"));
		oneWay.click();
		System.out.println("Click on One way.");
		
		//WebElement Oneway = DriverManager.getDriver().findElement(By.xpath("//input[@id='onewayTrip']"));
		//Oneway.click();
		
		/*
		 * WebElement oneWay = DriverManager.getDriver().findElement(By.id("onewayTrip")); Boolean
		 * isOneWaySelected = oneWay.isSelected();
		 * 
		 * if(isOneWaySelected) { System.out.println("One way is selected."); } else {
		 * System.out.println("One way is not selected."); }
		 */
		
		//DriverManager.getDriver().findElement(By.xpath("//a[@data-url-id=\"alternate_en_uk\"]"));
		
		//DriverManager.getDriver().findElement(By.xpath("//a[@data-url-id='alternate_en_uk']"));
	}
}
