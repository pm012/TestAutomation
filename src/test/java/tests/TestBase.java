package tests;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver = null;

	@BeforeClass
	public static void initialize() throws IOException {

		//will work only on debian
		//TODO handle driver setup for windows
		//System.setProperty("webdriver.chrome.driver",
				//System.getProperty("user.dir") + "/src/test/java/drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "/src/test/java/drivers/geckodriver");		
		
		
		driver = new ChromeDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		// To open site under test
		driver.get("https://demo.opencart.com/");

	}

	@AfterClass
	// Test cleanup
	public static void TeardownTest() {
		TestBase.driver.quit();
	}

}
