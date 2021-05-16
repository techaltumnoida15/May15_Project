package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchItems extends BaseTest{

	@Test
	public void testSearchItems() throws Exception {
		driver.get("http://www.flipkart.com");
		//Wait 
		Thread.sleep(3000);
		
		//Close Popup
		try {
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			System.out.println("Login popup is closed.");
		} catch (Exception e) {
			System.out.println("Login poup is not found.");
		}
		
		//Verify that user is on correct page
		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Online Shopping Site for Mobiles")) {
			System.out.println("User is on correct page.");
		}
		
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		
		//Type some item in search text box
		String searchItem = "Watches for men";
		driver.findElement(By.name("q")).sendKeys(searchItem);
		System.out.println("search item - " + searchItem + " - is typed.");
		
		//Click on Search
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		System.out.println();    //syso  => ctrl + space  => enter
		
		//Wait
		Thread.sleep(3000);
		
		//count no. of items available
		WebElement totalItems = driver.findElement(By.xpath("//span[@class='_10Ermr']"));
		//String totalItems = driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
		totalItems.getText();
		System.out.println(totalItems);
		
	}
}










