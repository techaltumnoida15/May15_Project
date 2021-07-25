package flipkart_may15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.project.report.ExtentReport;

public class SearchItems_List extends BaseTest{

	//DataProvider
	@Test
	public void testSearchItems() throws Exception {
		
		DriverManager.getDriver().get("http://www.flipkart.com");
		System.out.println("I am P2");
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
		WebElement searchTextEl = DriverManager.getDriver().findElement(By.name("q"));
		searchTextEl.sendKeys(searchItem);
		System.out.println("search item - " + searchItem + " - is typed.");

		//Click on Search
		DriverManager.getDriver().findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		System.out.println();    //syso  => ctrl + space  => enter

		//Wait
		Thread.sleep(5000);

		//count no. of items available
		WebElement totalItems = DriverManager.getDriver().findElement(By.xpath("//span[@class='_10Ermr']"));
		//String totalItems = DriverManager.getDriver().findElement(By.xpath("//span[@class='_10Ermr']")).getText();
		totalItems.getText();
		System.out.println("totalItems = " + totalItems.getText());

		//Extract all links and their description
		List<WebElement> itemLinkEls = DriverManager.getDriver().findElements(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg'])[2]/div[2]//a"));
		System.out.println(itemLinkEls);

		System.out.println("itemLinkEls size = " + itemLinkEls.size());
		int count = 0;

		for(int i = 0; i< itemLinkEls.size(); i++) {
			String elText = itemLinkEls.get(i).getText();
			System.out.println(elText);

			if(elText.contains("realme")) {
				count++;
			}
		}

		System.out.println(count);
	}



	@DataProvider
	public void getData() {
		//Test Data/ Locator
	}

}










