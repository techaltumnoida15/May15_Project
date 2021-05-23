package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class COA_RadioButton extends BaseTest{

	@Test
	public void coaTestRadioButton() throws Exception {
		//driver.get("http://www.cheapoair.com");
		driver.navigate().to("http://www.cheapoair.com");
		
		driver.getTitle();
		Thread.sleep(4000);   //
		
		//Check id Round Trip is selected or not
		Assert.assertTrue(driver.findElement(By.id("roundTrip")).isSelected(), "Round trip is not selected.");
		System.out.println("Round trip is selected.");
		
		WebElement RadioOnwayTrip =driver.findElement(By.id("onewayTrip"));
		boolean IsRadio = RadioOnwayTrip.isSelected();
		System.out.println("radio buton is " + IsRadio);
		
		Assert.assertTrue(!driver.findElement(By.id("onewayTrip")).isSelected(), "OneWay trip is selected.");
		System.out.println("OneWay trip is not selected.");
		
		//To select ONEWAY  
		WebElement oneWay = driver.findElement(By.cssSelector("label[for='onewayTrip']"));
		oneWay.click();
		System.out.println("Click on One way.");
		
		//WebElement Oneway = driver.findElement(By.xpath("//input[@id='onewayTrip']"));
		//Oneway.click();
		
		/*
		 * WebElement oneWay = driver.findElement(By.id("onewayTrip")); Boolean
		 * isOneWaySelected = oneWay.isSelected();
		 * 
		 * if(isOneWaySelected) { System.out.println("One way is selected."); } else {
		 * System.out.println("One way is not selected."); }
		 */
		
		//driver.findElement(By.xpath("//a[@data-url-id=\"alternate_en_uk\"]"));
		
		//driver.findElement(By.xpath("//a[@data-url-id='alternate_en_uk']"));
	}
}
