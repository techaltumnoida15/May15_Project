package OtherScenarios;

import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;


public class HandleAjaxListCOA extends BaseTest {

	@Test
	public void CheapOAir() throws InterruptedException {

		// Navigate to the site URL
		driver.navigate().to("https://www.cheapoair.com/");

		driver.getTitle();

		Thread.sleep(4000);

		// Input from Where

		WebElement fromWherElement = driver.findElement(By.xpath("//div[@class='widget__input is-active']"));

		System.out.println(fromWherElement.getText());
		
		
		// Input to Where
		
	WebElement toWhrElement = driver.findElement(By.id("to0"));
	toWhrElement.sendKeys("Lucknow");
	
//List<WebElement> suggestionList = driver.findElement(By.xpath("//div[@class='suggestion-box__content air is-visible']")).findElements(By.tagName("li"));

List<WebElement> suggestionList = driver.findElement(By.xpath("(//ul[@class='suggestion-box__list'])[2]")).findElements(By.tagName("li"));

System.out.println("Suggestion list found");

System.out.println(suggestionList.size());
	
	
	
	


	}

}
