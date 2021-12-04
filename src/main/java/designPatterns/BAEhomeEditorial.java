package designPatterns;

import java.security.PublicKey;

import org.basePage.com.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.pageObject.com.HomePage;
import org.pageObject.com.ListingPage;
import org.project.enums.WaitStrategy;
import org.projectName.com.DriverManager;
import org.testng.annotations.Test;

import com.project.report.Logger;

public class BAEhomeEditorial extends BasePage {
	
	//private static final String Username = null;
	//String Password = null;


	public BAEhomeEditorial() {}
	
	private By editorialUsername = By.name("username");
	
	private By editorialPassword = By.cssSelector("#password");
	
	private By editorialSubmitButton = By.id("fw_ui_dijit_Button_0_label");

	
	@Test
	
	public BAEhomeEditorial changeUrlBaEhomeEditorial () {
		DriverManager.getDriver().navigate().to("https://baeedit.dev.dotcom.baesystems.com/cas/login?");
		
		System.out.println(DriverManager.getDriver().getTitle());
		return this;
	}
	
	public BAEhomeEditorial enterusername(String usernameString) {
		
		type(editorialUsername, usernameString, "usernameString", WaitStrategy.NONE);
		
		return this;
		
	}
		
	public BAEhomeEditorial enterpassword(String passwordString) {
		
		System.out.println("passwordString=" +passwordString);
			
		type(editorialPassword, passwordString, "passwordString", WaitStrategy.NONE);
		
		return this;
		
	}
		
		public BAEhomeEditorial Submit() {
		
		clickOn(editorialSubmitButton, "Submit", WaitStrategy.CLICKABLE);
		
		return this;
		}
		
		

	
	}

