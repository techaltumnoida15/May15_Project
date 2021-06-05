package org.assignment.project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class Snapdeal extends BaseTest

{

	@Test
	public void Snapdeallogin() throws InterruptedException {


		driver.get("https://www.snapdeal.com/");
		
		//perform mouseover on Signup using Actions class
		
		WebElement signup=driver.findElement(By.xpath("//*[@class='accountInner']/span[1]"));
		
		
		Actions a1=new Actions(driver);
		a1.moveToElement(signup);
		a1.build().perform();
		
		
		// login Sanapdeal
		Thread.sleep(1000);
		WebElement login =driver.findElement(By.xpath("//*[@class='accountBtn btn rippleWhite']/a"));
		login.click();
		try {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"login-register-modal\"]/div/div[6]"));
		System.out.println("test112");
		}catch(Exception e)
		{
			System.out.println("data not found");
		}
		
		//driver.findElement(By.xpath("//div[@id=\"login-register-modal\"]/div/div[6]/form/div/input")).sendKeys("234234");
	
		
			 }
			 

	}


