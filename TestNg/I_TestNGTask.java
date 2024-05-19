package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class I_TestNGTask {
	 private WebDriver driver;
	    private I_POMTask I_POMTask;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        driver = new ChromeDriver();
	        I_POMTask = new I_POMTask(driver);
	        I_POMTask.navigateToLoginPage();
	    }

	    @Test
	    public void testSignInWithCorrectCredentials() {
	        String email = "cumbumgrocerystore@gmail.com";
	        String password = "Selva@kamali1";

	        I_POMTask.enterEmail(email);
	        I_POMTask.enterPassword(password);
	        I_POMTask.clickLoginButton();

	        String currentUrl = I_POMTask.getCurrentURL();
	        Assert.assertEquals(currentUrl, "https://www.facebook.com/");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}


