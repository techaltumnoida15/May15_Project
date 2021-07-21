package may23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

public class HandleAjaxListTest extends BaseTest{

	@Test
	public void handleAjaxList() throws Exception {
		DriverManager.getDriver().get("http://www.google.com");
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);

		
		//Check that page is loaded
		wait.until(d -> ((JavascriptExecutor)DriverManager.getDriver()).executeScript("return document.readyState").equals("complete"));		
		
		//Type some search keyword
		String searchKeyword = "python";
		WebElement googleTextbox = DriverManager.getDriver().findElement(By.name("q"));
		googleTextbox.sendKeys(searchKeyword);
		
		//wait
		//Thread.sleep(3000);
		
		wait
		.pollingEvery(Duration.ofMillis(100))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='erkvQe']")));
		
		//.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(By.cssSelector("//ul[@class='erkvQe']"))))
		
		
		//Explicit wait
		//1. Wait - interface
		//Wait<F>
		
		String clickableSuggestion = "python basics";
		
		//Handle suggestion List
		List<WebElement> suggestionList = DriverManager.getDriver().findElement(By.xpath("//ul[@class='erkvQe']")).findElements(By.tagName("li"));
		System.out.println("Total suggestions are = " + suggestionList.size());
		
		//boolean isSuestionFound = false;
		int isSuestionFound = 0;
		//Get text of each suggestion
		for(int i = 0; i<suggestionList.size(); i++) {
			String suggestionText = suggestionList.get(i).getText();
			System.out.println(suggestionText);
			
			if(suggestionText.equalsIgnoreCase(clickableSuggestion)) {
				//Click
				suggestionList.get(i).click();
				//isSuestionFound = true;
				isSuestionFound++;
				break;
			}
		}
		
		if(isSuestionFound == 0) {
			System.out.println("Sugestion not found");
		}
		else {
			System.out.println("Suggestion found.");
		}
	}
}

/*
 * Go to snapdeal.com
 * Mouse over - SinIn
 * Click on Loin
 * Enter mobile number in popup
 * Click on Continue
 */












