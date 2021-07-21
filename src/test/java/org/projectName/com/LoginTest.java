package org.projectName.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void loginTest() throws Exception {   //Login Test => UserName=CORRECT, password=INCORRECT

		//Click on SignIn
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Sign in']")).click();
		System.out.println("Click on Login");
		
		//Verify that login page is open?
		if(DriverManager.getDriver().findElement(By.id("identifierId")).isDisplayed()) {
			System.out.println("Login page is displayed.");
			
			//Type Email ID there
			DriverManager.getDriver().findElement(By.id("identifierId")).sendKeys("atyagi.mails@gmail.com");
			System.out.println("Enter Email.");
			
			DriverManager.getDriver().findElement(By.xpath("//button[@jsname='LgbsSe']")).click();
			System.out.println("Click on SignIn.");
			
			//Wait sometime
			Thread.sleep(3000);
			
			DriverManager.getDriver().findElement(By.name("password")).sendKeys("abc@123");
			System.out.println("Password typed.");
			
			Thread.sleep(3000);
			
			//Check for error message.
			String errorMessage = DriverManager.getDriver().findElement(By.xpath("div[jsname='B34EJ']")).getText();
			if(errorMessage.contains("Wrong password")) {
				System.out.println("Login is failed.");
			}
		}
		else {
			//Fail Test - Throw some exception
		}
	}

	
}
