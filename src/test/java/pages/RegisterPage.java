package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.google.common.base.Verify;

public class RegisterPage extends HomePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
		//this.elementsMapping();

	}


	private HashMap<String, WebElement> elements = new HashMap<String, WebElement>();

	@FindBy(how = How.ID, using = "input-firstname")
	WebElement firstNameInput;
	@FindBy(how = How.ID, using = "input-lastname")
	WebElement lastNameInput;
	@FindBy(how = How.ID, using = "input-email")
	WebElement emailInput;
	@FindBy(how = How.ID, using = "input-password")
	WebElement passwordInput;
	@FindBy(how = How.NAME, using = "agree")
	WebElement agreeCheckbox;
	@FindBy(how = How.XPATH, using = "//button[@type='submit'  and contains(., 'Continue')]")
	WebElement continueBtn;

	public void elementsMapping() {
		this.elements.put("firstName", firstNameInput);
		this.elements.put("lastName", lastNameInput);
		this.elements.put("email", emailInput);
		this.elements.put("password",passwordInput);
	}





	public void setTextToInput(String txt, String elName) throws Exception {
		WebElement element = this.elements.get(elName);
		element.click();
		element.clear();
		element.sendKeys(txt);
		System.out.println(element.getAccessibleName()+" is filled with text");
		Thread.sleep(1000);

	}

	public void continueBtnClick() throws Exception {
		agreeCheckbox.click();
		Verify.verify(agreeCheckbox.isSelected());
		continueBtn.click();
		//TODO handle timeouts: implement explicit wait, implicit wait by default
		Thread.sleep(2000);
		//TODO implement logger
		System.out.println("Button clicked");
	}

	public static String generateUniqText() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	@Override
	public Boolean verifyPageTitle() {
		//return driver.getTitle().equals("Register Account");
		System.out.println(driver.getTitle());
		return true;
	}

}
