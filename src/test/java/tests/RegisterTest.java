package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import com.google.common.base.Verify;
import pages.RegisterPage;

public class RegisterTest extends TestBase {
    @Test
    public void init() throws Exception {
        String txt = "";
        RegisterPage regPage = PageFactory.initElements(driver, RegisterPage.class);
        regPage.clickMyAccountDropdown();
        regPage.clickOnRegisterLink();
        Verify.verify(regPage.verifyPageTitle());
        //regPage.verifyPageTitle("Register Account");
        regPage.elementsMapping();
        txt = regPage.generateUniqText();
        regPage.setTextToInput(txt, "firstName");
        txt = regPage.generateUniqText();
        regPage.setTextToInput(txt, "lastName");
        txt = regPage.generateUniqText();
        regPage.setTextToInput(txt+"@gmail.com", "email");
        regPage.setTextToInput("SoftServe", "password");
        regPage.continueBtnClick();

        //Thread.sleep(5000);

    }
}
