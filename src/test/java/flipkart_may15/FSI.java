package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.project.report.ExtentReport;


public class FSI extends BaseTest{
	@Test
	public void webapp() throws Exception{
		// navigate to FSI portal
		//DriverManager.getDriver().get("https://portal.dreamscapetest.com/TestAutomationCodeMerge/Account/Login/");
				
		DriverManager.getDriver().get("http://www.google.com");
		// wait for some time
		
		//Make test fail
		Assert.assertTrue(false);
		
		Thread.sleep(5000);
		
		//check the existence of UserName field
		WebElement UserNameTextBox = DriverManager.getDriver().findElement(By.id("UserName"));
		Assert.assertTrue(UserNameTextBox.isDisplayed(),"User name field is not present");
		System.out.println("User name text box displayed");
		
		// check the existence of Password field
		WebElement PasswordTextBox = DriverManager.getDriver().findElement(By.id("Password"));
		Assert.assertTrue(PasswordTextBox.isDisplayed(),"Password field is not present");
		System.out.println("Password field displayed");
		
		// Enter username and password
		Boolean Is_UserName= UserNameTextBox.isEnabled();
		System.out.println("UserName text box is" + Is_UserName);
		
		if(UserNameTextBox.isEnabled()) 
		{
			System.out.println("Enter user name");
			UserNameTextBox.sendKeys("CodeMerge.User8");
			Thread.sleep(3000);
			System.out.println("Enter Password");
			PasswordTextBox.sendKeys("Welcome@1234");
		}	
	
		//Verify Login button and click on it
		WebElement LoginButton = DriverManager.getDriver().findElement(By.xpath("//input[@value='Log in']"));
		if (LoginButton.isEnabled())
		{
			LoginButton.click();
			System.out.println("login button clicked");
			Thread.sleep(5000);
			{
				System.out.println("login button is not present");
			
			}
		}
		
		// Verify Home page
		WebElement HomeLink = DriverManager.getDriver().findElement(By.xpath(".//i[@class='menu-icon icon-home-index icon-white']"));
	Assert.assertTrue(HomeLink.isDisplayed(), "Home page is not displayed");
	System.out.println("Home page displayed");
	
	//click on Web menu and select Web application
	WebElement WebLink= DriverManager.getDriver().findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Web')]"));
	WebLink.click();
	Thread.sleep(3000);
	
	WebElement WebApplication= DriverManager.getDriver().findElement(By.xpath(".//i[@class='menu-icon icon-webapp-index icon-black']"));
	WebApplication.click();
	Thread.sleep(3000);
	
	WebElement AddWebappLink= DriverManager.getDriver().findElement(By.xpath("//div[@id='AddApplicationOption']//a"));
	
	Assert.assertTrue(AddWebappLink.isDisplayed(), "Add web app link is not available");
	System.out.println("Add Web app buttonis present");
	if (AddWebappLink.isEnabled())
	{
	AddWebappLink.click();
	Thread.sleep(3000);
	}
	
	}
}
