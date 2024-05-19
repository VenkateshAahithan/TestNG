package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class H_Task {
	 private WebDriver driver;
	    private String baseUrl = "https://www.facebook.com/";

	    @BeforeClass
	    public void setUp() {
	        // Set the path of the ChromeDriver executable
	        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        // Initialize ChromeDriver instance
	        driver = new ChromeDriver();
	        // Navigate to Facebook login page
	        driver.get("https://www.facebook.com/");
	    }

	    @Test
	    public void testSignInWithCorrectCredentials() {
	        String email = "cumbumgrocerystore@gmail.com";//example@gmail.com
	        String password = "Selva@kamali1";//example_password

	        // Locate email and password fields and enter credentials
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        emailField.sendKeys(email);
	        passwordField.sendKeys(password);

	        // Click on the Sign In button
	        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	        signInButton.click();

	        // Wait for the next page to load (you may need to implement a wait strategy here)
	        // For simplicity, let's assume successful login redirects to the home page

	        // Verify if the user is redirected to the home page after successful login
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertEquals(currentUrl, "https://www.facebook.com/");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser window
	        driver.quit();
	    }
	}


