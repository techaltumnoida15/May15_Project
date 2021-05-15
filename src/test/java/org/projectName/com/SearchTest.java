package org.projectName.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	
	@Test
	public void testSearchFunctionality() throws Exception {
		//Type some keyword and search
		//Findelement(By AnyLocator)[TextBox].DoSomeOperation (Type)
		String searchString = "Selenium";
		driver.findElement(By.name("q")).sendKeys(searchString);
		System.out.println("Search String " + searchString + " is typed.");
		
		//Press Enter to get results
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Enter is pressed.");
		
		//Wait for some time to load reault page
		Thread.sleep(3000);
		
		//Get text of total results and display them
		String result = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Total records are = " + result);
	}

}
