package flipkart_may15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchNaukri_Set extends BaseTest{

	@Test
	public void testSearchItems() throws Exception {
		driver.get("http://www.naukri.com");
		//Wait 
		Thread.sleep(3000);
		
		//handle multiple browser windows
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		System.out.println("Total open windows are = " + windowHandles.size());
		
		List<String> myList = new ArrayList<String>();
		Iterator<String> itr = windowHandles.iterator();
		
		for(int i = 0; i<windowHandles.size(); i++) {
			myList.add(itr.next());
		}
		
		driver.switchTo().window(myList.get(1));
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
}










