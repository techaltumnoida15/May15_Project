package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class SearchItems extends BaseTest{

	@Test
	public void testSearchItems() throws Exception {
		DriverManager.getDriver().get("http://www.flipkart.com");
		//Wait 
		Thread.sleep(3000);
		
		//Close Popup
		try {
			DriverManager.getDriver().findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			System.out.println("Login popup is closed.");
		} catch (Exception e) {
			System.out.println("Login poup is not found.");
		}
		
		//Verify that user is on correct page
		String pageTitle = DriverManager.getDriver().getTitle();
		if(pageTitle.contains("Online Shopping Site for Mobiles")) {
			System.out.println("User is on correct page.");
		}
		
		String pageURL = DriverManager.getDriver().getCurrentUrl();
		System.out.println(pageURL);
		
		
		//Type some item in search text box
		String searchItem = "Watches for men";
		DriverManager.getDriver().findElement(By.name("q")).sendKeys(searchItem);
		System.out.println("search item - " + searchItem + " - is typed.");
		
		//Click on Search
		DriverManager.getDriver().findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		System.out.println();    //syso  => ctrl + space  => enter
		
		//Wait
		Thread.sleep(3000);
		
		//count no. of items available
		WebElement totalItems = DriverManager.getDriver().findElement(By.xpath("//span[@class='_10Ermr']"));
		//String totalItems = DriverManager.getDriver().findElement(By.xpath("//span[@class='_10Ermr']")).getText();
		totalItems.getText();
		System.out.println(totalItems);
		
	}
}










