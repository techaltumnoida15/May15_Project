package baesystems12c;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.projectName.com.BaseTest;
import org.projectName.com.Driver;
import org.testng.annotations.Test;

public class BaeEditorialLogin extends BaseTest{
	
		@Test
	
	public void editorialLogin () throws InterruptedException {
			driver.navigate().to("https://baeedit.dev.dotcom.baesystems.com/cas/login?");
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(5000);
			
			// enter the username
			
			String username = "Bharti";
			
			//driver.findElement(By.xpath("//div[@class='dijitReset dijitInputField dijitInputContainer']")).sendKeys(username);
			driver.findElement(By.name("username")).sendKeys(username);
			
			System.out.println("Username entered");
			
			//enter the password
			
			String passwrd = "Bharti";
			
			//driver.findElement(By.xpath("//div[@class='dijit dijitReset dijitInline dijitLeft dijitTextBox dijitValidationTextBox UIInput']")).sendKeys(password);
			
			driver.findElement(By.name("password")).sendKeys(passwrd);
			
			System.out.println("Password entered");
			
			// locate and click on login button
			
			driver.findElement(By.id("fw_ui_dijit_Button_0_label")).click();
			
			System.out.println(driver.getTitle());
			
			
		}
	
		
		
		

	

}
