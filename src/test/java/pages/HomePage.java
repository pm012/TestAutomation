package pages;


import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver){ 
                this.driver=driver; 
        }

	// Using FindBy for locating elements
	@FindBy(how = How.CSS, using = "li.list-inline-item a.dropdown-toggle[href='']")
	WebElement myAccountToggle;
	@FindBy(how = How.CSS, using = "a[href*='account/login']")
	WebElement logInLink;
	@FindBy(how = How.CSS, using = "a[href*='account/login']")
	WebElement registerLink;

	// Defining all the user actions (Methods) that can be performed in the Opencart
	// home page

	// This method to click on My Account Dropdown
	public void implicitWait() {
		try {
			driver.wait(5000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
	
	
	public void clickMyAccountDropdown() throws Exception {
		
		myAccountToggle.click();
		Thread.sleep(5000);
		
		
		
	}

	// This method to click on Login link
	public void clickOnLogInLink() {
		logInLink.click();		
	}

	// This method to open registration page
	public void clickOnRegisterLink() {
		registerLink.click();
		
	}

}
