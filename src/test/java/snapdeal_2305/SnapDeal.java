package snapdeal_2305;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
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
		
	driver.navigate().to("https://www.snapdeal.com/");
	
	
	
	// Assignment 2- Find the sign- in locator 

	WebElement signIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	
	//Assignment 3 -Mouse over on the Sign-in element
	
	Actions objActions = new Actions (driver);
	
	objActions.moveToElement(signIn);
	
	// Build function
	
	objActions.build().perform();
	
	Thread.sleep(4000);
	
	System.out.println("Sign-in button hovered");
	
	// Assignment 4- Click on Login
	
	WebElement loginElement  = driver.findElement(By.xpath("//a[text()='login']"));
	loginElement.click();
	
	System.out.println("Sign-in clicked");
	
	//Assignment 5- Enter mobile number on the login popup\
	

	//WebElement Mobileinputbox = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	
	WebElement Mobileinputbox = driver.findElement(By.xpath("//input[@name='username']"));
	
	driver.switchTo().frame(Mobileinputbox);
	
	System.out.println("Popup Frame selected to Enter mobilEnter number");
	

		Mobileinputbox.sendKeys("8447855711");
		
		//Click Continue
		
		WebElement continueBT = driver.findElement(By.xpath("//*[@id='checkUser']"));
		
		continueBT.click();
		
		
	}
	

	
	}


