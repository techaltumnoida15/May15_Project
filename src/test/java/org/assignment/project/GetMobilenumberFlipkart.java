package org.assignment.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.testng.annotations.Test;

public class GetMobilenumberFlipkart extends BaseTest
{
	WebDriver driver;
	@Test
	public void moblieprice() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
		
		WebElement search= driver.findElement(By.xpath("//*[@class='col-12-12 _1MRYA1']"));
		
		Thread.sleep(1000);
		search.sendKeys("Mobile");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@class='L0Z3Pu']")).click();
		
		
	}
	

}
