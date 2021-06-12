package flipkart_may15;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.projectName.com.BaseTest;
import org.testng.Assert;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.Test;

public class FaceBook_NewAccountTest extends BaseTest {

	@Test
	public void facebookNewAccountTest() throws Exception {
		// Launch FB
		driver.get("https://www.facebook.com/");

		// Click on New Account
		WebElement createAccount = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]/a"));// u_0_2_X0
		Assert.assertTrue(createAccount.isEnabled(), "Create account button is not enable");

		System.out.println("Create account button is enable");

		// driver.findElement(By.id("u_0_2_fS")).click();

		System.out.println("Create account button is enable");		
		//driver.findElement(By.id("u_0_2_fS")).click();

		createAccount.click();
		System.out.println("Click on Create New Account");

		// TextBox - Write
		// Button - Click
		// Radio button - Select / Check if it is selected or not
		// Drop Down -
		// Checkbox -

		// Select DOB - Drop down
		/*
		 * 1. Find element - Dropdown
		 * 
		 * 2. Select - class (Methods - create Object of this class and use methods)
		 * 
		 * How to create object of a class
		 * 
		 * ClassName objName = new ClassName();
		 * 
		 */
		Thread.sleep(2000);

		// Day
		WebElement dayDropdown = driver.findElement(By.id("day"));

		Select selectDay = new Select(dayDropdown);
		selectDay.selectByIndex(4);

		// Month
		WebElement montDropdown = driver.findElement(By.id("month"));
		Select selectMonth = new Select(montDropdown);
		selectMonth.selectByValue("4");

		// Year
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText("1905");


		// Assignment
		// Select Gender
		WebElement gendermale = driver.findElement(By.xpath("(//*[@class='_8esa'])[2]"));
		gendermale.click();
		Assert.assertTrue(gendermale.isSelected(), "gender is selected.");
		/*
		 * if (gendermale.isSelected()) { System.out.println("Selected"); } else {
		 * System.out.println("not Selected"); }
		 */

		// Verify that desired gender is selected


		
		
		//Assignment (Done)
		
		//Select Gender - using the HTML class 
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		femaleRadioButton.click();
		
		//Verify that desired gender is selected
		assertTrue(femaleRadioButton.isSelected(), "Female is not selected");
		System.out.println("Female is selected as gender");
		
		//Select Custom option for Gender
		WebElement customradiobuttonElement = driver.findElement(By.xpath("(//input[@class='_8esa'])[3]"));
		customradiobuttonElement.click();
		
		//Verify that custom option is selected
	    assertTrue(customradiobuttonElement.isSelected(), "Custom option is not selected");
	    System.out.println("Custom option is selected");

		//Assignment
		//Select Gender - Male
		//WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		//maleRadioButton.click();
		
		/*
		 * //Verify that desired gender is selected boolean isMaleRadioSelected =
		 * maleRadioButton.isSelected();
		 * 
		 * if(isMaleRadioSelected) { System.out.println("Male has been selected"); }
		 * else { System.out.println("Male is not selected."); }
		 */
		
		//Assert.assertTrue(maleRadioButton.isSelected(), "Male is not selected.");
		//System.out.println("Male has been selected");
		
		
		/*
		 * //Verify that desired gender is selected boolean isMaleRadioSelected =
		 * maleRadioButton.isSelected();
		 * 
		 * if(isMaleRadioSelected) { System.out.println("Male has been selected"); }
		 * else { System.out.println("Male is not selected."); }
		 */
		

		//Assert.assertTrue(maleRadioButton.isSelected(), "Male is not selected.");
		//System.out.println("Male has been selected");


	}
}
