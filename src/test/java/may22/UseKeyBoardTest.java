package may22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class UseKeyBoardTest extends BaseTest{

	@Test
	public void keyboardTest() {
		driver.get("http://www.onetravel.com");
		
		/*
		//Type some skills
		WebElement skillTextbox = driver.findElement(By.name("keyword"));
		skillTextbox.sendKeys("Java");
		
		//Press TAB key
		skillTextbox.sendKeys(Keys.TAB);
		
		//Type Location
		*/
		
		//Clear FROM text box
		// 1st way to clear - FROM
		//driver.findElement(By.xpath("//a[@class='suggestion-box__clear icon']")).click();
		
		
		//2nd way to clear - FROM
		/*
		 * WebElement from = driver.findElement(By.id("from0")); from.click();
		 * 
		 * //Use BackSpace Key from.sendKeys(Keys.BACK_SPACE);
		 */
		
		//How to get written text from a TEXT BOX
		WebElement from = driver.findElement(By.id("from0"));
		String fromValue = from.getAttribute("value");
		
		System.out.println(fromValue);
		
		String att2 = from.getAttribute("aria-describedby");
		System.out.println(att2);
		
		//Search Button
		WebElement searchButton = driver.findElement(By.id("searchNow"));
		String searchButtonTagName = searchButton.getTagName();
		System.out.println("searchButtonTagName = " + searchButtonTagName);
		
		//Assignment
		//searchButton
		//from.getCssValue(propertyName)   => do some study about it.
	}
}
