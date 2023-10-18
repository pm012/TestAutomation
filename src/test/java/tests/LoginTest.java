package tests;


import org.junit.Test;

import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;



public class LoginTest extends TestBase{
	
	@Test
	public void init() throws Exception{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickMyAccountDropdown();		
		loginPage.clickOnLogInLink();
		loginPage.setTextToEmail("hohoho@gmail.com");
		//Thread.sleep(5000);
		
	}
	
}