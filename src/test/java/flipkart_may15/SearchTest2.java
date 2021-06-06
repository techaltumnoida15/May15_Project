package flipkart_may15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest2 extends BaseTest{

	@Test
	public void searchTest() throws Exception {
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);

		//Close Popup
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();

		//Search items
		String searchItem = "mobiles";
		WebElement searchTextbox = driver.findElement(By.name("q"));
		searchTextbox.sendKeys(searchItem);

		//Click on search
		WebElement searchIcon = driver.findElement(By.cssSelector("button[class='L0Z3Pu']"));
		searchIcon.click();

		//Wait
		Thread.sleep(2000);

		//Get total items TEXT
		WebElement totalElements = driver.findElement(By.cssSelector("span[class='_10Ermr']"));
		System.out.println(totalElements.getText());

		//driver.findElement(By.cssSelector("div[class='_5THWM1'] > div:nth-child(4)")).click();
		
		//driver.findElement(By.cssSelector("div[class='_5THWM1']")).findElements(By.tagName("span")) 
		
		List<WebElement> allTabsContect = driver.findElements(By.cssSelector("div[class='_5THWM1'] > *"));
		
		//Java 8
		//Click on Tab - 'Price -- Low to High'
		allTabsContect.stream().forEach(y -> {
			if(y.getText().equalsIgnoreCase("Price -- Low to High")) 
				y.click();
		});

		Thread.sleep(2000);
		//Collect Price
		List<Integer> priceBeforeSort = new ArrayList<>();
		
		driver.findElements(By.cssSelector("div[class='_30jeq3 _1_WHN1']"))
		.stream().map(e -> e.getText())
		//.forEach(t -> System.out.println(t));
		.forEach(a -> {
			if(a.contains(",")) {
				a = a.split(",")[0] + a.split(",")[1];				
			}
			a = a.substring(1, a.length());	
			priceBeforeSort.add(Integer.parseInt(a));
			
		});
		
		System.out.println(priceBeforeSort);
		
		List<Integer> priceAfterSort = priceBeforeSort.stream().sorted().collect(Collectors.toList());
		
		System.out.println(priceAfterSort);
		
		Assert.assertTrue(priceBeforeSort.equals(priceAfterSort), "List is not sorted.");
		System.out.println("List is sorted.");
		
		//ascending / descending - ?
		//arr = [639, 645, 645, 649]
		//arr[0] < arr[1]
		//true - A
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int i = 0; i< allTabsContect.size(); i++) {
			String tabText = allTabsContect.get(i).getText();
			System.out.println("tabText = " + tabText);
			
			if(tabText.equalsIgnoreCase("Price -- Low to High")) {
				allTabsContect.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		//Extract price of all items of 1 first page
		List<String> allPrice = new ArrayList<>();
		List<WebElement> allItemsPriceList = driver.findElements(By.cssSelector("div[class='_30jeq3 _1_WHN1']"));
		
		for(int j = 0; j<allItemsPriceList.size(); j++) {
			String s = allItemsPriceList.get(j).getText();
			
			String itemPrice = s.substring(1, s.length());
			allPrice.add(itemPrice);
		}
		
		System.out.println(allPrice);
		
		//New List<Integer>  <=    from allPrice(String)
		
		*/
	}
}






