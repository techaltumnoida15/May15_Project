package flipkart_may15;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

	@Test
	public void searchTest() throws Exception {
		DriverManager.getDriver().get("http://www.flipkart.com");
		Thread.sleep(4000);

		//Close Popup
		DriverManager.getDriver().findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();




		//List<WebElement> myList = DriverManager.getDriver().findElements(By.id("abc"));
		//Search items
		String searchItem = "mobiles";
		WebElement searchTextbox = DriverManager.getDriver().findElement(By.name("q"));
		searchTextbox.sendKeys(searchItem);

		//Click on search
		WebElement searchIcon = DriverManager.getDriver().findElement(By.cssSelector("button[class='L0Z3Pu']"));
		searchIcon.click();

		//Wait
		Thread.sleep(2000);

		//Get total items TEXT
		WebElement totalElements = DriverManager.getDriver().findElement(By.cssSelector("span[class='_10Ermr']"));
		System.out.println(totalElements.getText());


		//driver.findElement(By.cssSelector("div[class='_5THWM1'] > div:nth-child(4)")).click();

		//driver.findElement(By.cssSelector("div[class='_5THWM1']")).findElements(By.tagName("span")) 

		


		//DriverManager.getDriver().findElement(By.cssSelector("div[class='_5THWM1'] > div:nth-child(4)")).click();
		
		//DriverManager.getDriver().findElement(By.cssSelector("div[class='_5THWM1']")).findElements(By.tagName("span")) 
		
		List<WebElement> allTabsContect = DriverManager.getDriver().findElements(By.cssSelector("div[class='_5THWM1'] > *"));
		

		for(int i = 0; i< allTabsContect.size(); i++) {
			String tabText = allTabsContect.get(i).getText();
			if(tabText.equalsIgnoreCase("Price -- Low to High")) {
				allTabsContect.get(i).click();
				break;
			}
		}

		Thread.sleep(3000);
		//Extract price of all items of 1 first page
		List<String> allPrice = new ArrayList<>();



		List<WebElement> allItemsPriceList = DriverManager.getDriver().findElements(By.cssSelector("div[class='_30jeq3 _1_WHN1']"));
		

		for(int j = 0; j<allItemsPriceList.size(); j++) {
			String s = allItemsPriceList.get(j).getText();
			String ItemPrice = s.substring(1, s.length());
			allPrice.add(ItemPrice);

		}

		System.out.println(allPrice);

		//New List<Integer>  <=    from allPrice(String)


	}
}






