package snapdeal_2305;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

/*
 * Go to snapdeal.com
 * Mouse over - SinIn
 * Click on Loin
 * Enter mobile number in popup
 * Click on Continue
 */

@Test
public class SnapDeal extends BaseTest {


	public void SdLogin() throws InterruptedException {

		//Assignment 1 - Go to snapdeal.com

		DriverManager.getDriver().navigate().to("https://www.snapdeal.com/");

		// Assignment 2- Find the sign- in locator 

		WebElement signIn = DriverManager.getDriver().findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));

		//Assignment 3 -Mouse over on the Sign-in element

		Actions objActions = new Actions (DriverManager.getDriver());

		objActions.moveToElement(signIn);

		// Build function

		objActions.build().perform();

		Thread.sleep(4000);

		System.out.println("Sign-in button hovered");

		// Assignment 4- Click on Login

		WebElement loginElement  = DriverManager.getDriver().findElement(By.xpath("//a[text()='login']"));
		loginElement.click();

		System.out.println("Sign-in clicked");

		//Assignment 5- Enter mobile number on the login popup\


		//WebElement Mobileinputbox = DriverManager.getDriver().findElement(By.xpath("//*[@id=\"userName\"]"));

		//DriverManager.getDriver().switchTo().frame(Mobileinputbox);
		WebElement frameLogin = DriverManager.getDriver().findElement(By.id("loginIframe"));
		DriverManager.getDriver().switchTo().frame(frameLogin);
		
		List<WebElement> abc = DriverManager.getDriver().findElements(null);

		System.out.println("Popup Frame selected to Enter mobilEnter number");

		WebElement Mobileinputbox = DriverManager.getDriver().findElement(By.xpath("//input[@name='username']"));
		Mobileinputbox.sendKeys("8447855711");

		//Click Continue

		WebElement continueBT = DriverManager.getDriver().findElement(By.xpath("//*[@id='checkUser']"));
		continueBT.click();
		
	}



}


