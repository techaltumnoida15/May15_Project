package may23;

import java.util.List;
import java.util.function.IntFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Snapdeel extends BaseTest {
	
	@Test	
	// declare method
	
	public  void enterMobileNumber() throws Exception{
		
		// Open Snapdeal
		driver.navigate().to("https://www.snapdeal.com/");
		
		// Hover on SignIn Link
		
		WebElement SignInLink = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Assert.assertTrue(SignInLink.isDisplayed(), "SignIn link is not present");
		System.out.println("SignIn link is present");
		
		Actions obj1 = new Actions(driver);
		obj1.moveToElement(SignInLink);
		Thread.sleep(3000);
		obj1.build().perform();
		
		System.out.println("Cursor moved to Sign link");
		
		// Click on login button
		
			 WebElement LoginBtn = driver.findElement(By.xpath(".//a[text()='login']"));
				 LoginBtn.click();
				 System.out.println("login button clicked");
				 Thread.sleep(5000);
				 
				 // Verify Login Page displayed
				 
				 
				 // count iframe tag
				 
				 List<WebElement> Count = driver.findElements(By.tagName("iframe"));
			 System.out.println("total frame on a page "+ Count.size());
				 
			 // Verify login page header
			 
			 driver.switchTo().frame("loginIframe");
			 
				  WebElement Header = driver.findElement(By.xpath("//div[@class='login-register-common']//header"));
				  Assert.assertTrue(Header.isDisplayed(), "Login popup is not opened");
				  System.out.println("Enter your mobile number to login Ssanpdeal");
				  
				   String ActualHeaderMessage = "Please provide your Mobile Number or Email to Login/ Sign Up on Snapdeal";
				  
				  WebElement HeaderMessage = driver.findElement(By.xpath("//div[@class='login-register-common']//p"));
				   String MessageOnScreen = HeaderMessage.getText();
				   
				   if (ActualHeaderMessage.equals(MessageOnScreen))
				   {
					   
					   System.out.println("Verified login page");
				   }
				   
					   else
					   
					   {
						   
						System.out.println("Not a Login page");
					}   
					   
				   // Enter mobile number or Email
				 
				 WebElement MobilNumber_Email = driver.findElement(By.xpath(".//input[@placeholder= 'Mobile Number/ Email']"));
				 MobilNumber_Email.sendKeys("mittal.sahil2010@gmail.com");
				 
				 // Click on Continue button
				 
				 WebElement Login_Continue = driver.findElement(By.xpath("//div[@class='login-register-common']//button[text()='continue']"));
				 Login_Continue.click();
				 
				 driver.switchTo().defaultContent();
	}		 
	
	

}
