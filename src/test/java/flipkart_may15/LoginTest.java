package flipkart_may15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.projectName.com.BaseTest;
import org.projectName.com.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void loginTest() throws Exception {
		DriverManager.getDriver().get("http://www.flipkart.com");
		System.out.println("I am in LoginTest");
		Assert.assertTrue(false);
		
		//Wait 
		Thread.sleep(3000);

		//Close Popup - Login Popup
		try {
			DriverManager.getDriver().findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			System.out.println("Login popup is closed.");
		} catch (Exception e) {
			System.out.println("Login poup is not found.");
		}
		
		
		
		//check/verify that login button is displayed/enable
		WebElement loginButton = DriverManager.getDriver().findElement(By.xpath("//a[text()='Login']"));
		
		/*
		 * Boolean isDisplayed = loginButton.isDisplayed();
		 * 
		 * if(isDisplayed) { //Do some operations }
		 */
		
		/*
		 * if(loginButton.isDisplayed()) {
		 * System.out.println("Login button is displayed");
		 * 
		 * if(loginButton.isEnabled()) { System.out.println("Login button is enabled.");
		 * 
		 * loginButton.click(); System.out.println("Click on Login Button."); } }
		 */
		
		//Assertions - Verification / Validations
		
		//Assert.assertEquals(4, 5);
		
		//Assert.assertTrue(false, "Hello");
		
		Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed.");
		System.out.println("Login button is displayed.");
		
		Assert.assertTrue(false);
		
		
	}

	/*
	 * @Test public void anotherTest() { //Fail }
	 */
}
