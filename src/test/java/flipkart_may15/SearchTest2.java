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

		List<WebElement> allTabsContect = driver.findElements(By.cssSelector("div[class='_5THWM1'] > *"));

		//Java 8
		//Click on Tab - 'Price -- Low to High'
		allTabsContect.stream().forEach(y -> {
			if(y.getText().equalsIgnoreCase("Price -- Low to High")) 
				y.click();
		});

		Thread.sleep(2000);
		//Collect Price in a list
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

		//Check if list is in ascending or descending order
		boolean flag = false;
		for(int i = 0; i < priceAfterSort.size() - 1; i++) {
			if(priceAfterSort.get(i) < priceAfterSort.get(i + 1)) 
				flag = true;
		}
		if(flag == true) 
			System.out.println("List is in ascending order");
		else 
			System.out.println("List is in descending order");

	}
	
	
}






