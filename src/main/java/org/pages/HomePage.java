package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFrom(String fromCity) {
		
		//driver.findElement(By.cssSelector("")).sendKeys(fromCity);
		System.out.println("From city " + fromCity + " is entered.");
	}
	
	
	public void enterTo(String toCity) {
		driver.findElement(By.cssSelector("")).sendKeys(toCity);
		System.out.println("From city " + toCity + " is entered.");
	}
}
