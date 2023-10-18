package pages;

import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends HomePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}	
			@FindBy(how = How.ID, using = "input-email")
			WebElement emailInput;
			@FindBy(how = How.ID, using = "input-password")
			WebElement passwordInput;
			
			
			
			public void setTextToEmail(String txt) throws Exception {
				emailInput.click();
				emailInput.clear();
				emailInput.sendKeys(txt);
				System.out.println("email is filled with text");
				//super.implicitWait();
				Thread.sleep(5000);
	 
			}

			@Override
			public Boolean verifyPageTitle(){
				return driver.getTitle().equals("Account Login");
			}

}
