package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class J_Task {
	
	

	    WebDriver chromeDriver;
	    WebDriver firefoxDriver;
	    WebDriver ieDriver;

	    @BeforeClass
	    public void setUp() {
	        // Set Chrome driver path
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize Chrome driver
	        chromeDriver = new ChromeDriver();

	        // Initialize Firefox driver
	        firefoxDriver = new FirefoxDriver();

	        // Set Internet Explorer driver path
	        //System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");

	        // Initialize Internet Explorer driver
	        ieDriver = new InternetExplorerDriver();
	    }

	    @Test
	    public void testLogin() throws InterruptedException {
	        // Navigate to Facebook login page
	        chromeDriver.get("https://www.facebook.com");
	        firefoxDriver.get("https://www.facebook.com");
	        ieDriver.get("https://www.facebook.com");

	        // Enter username and password
	        chromeDriver.findElement(By.id("email")).sendKeys("cumbumgrocerystore@gmail.com");
	        chromeDriver.findElement(By.id("pass")).sendKeys("Selva@kamali1");
	        chromeDriver.findElement(By.id("loginbutton")).click();Thread.sleep(5000);

	        firefoxDriver.findElement(By.id("email")).sendKeys("cumbumgrocerystore@gmail.com");
	        firefoxDriver.findElement(By.id("pass")).sendKeys("Selva@kamali1");
	        firefoxDriver.findElement(By.id("loginbutton")).click();Thread.sleep(5000);

	        ieDriver.findElement(By.id("email")).sendKeys("cumbumgrocerystore@gmail.com");
	        ieDriver.findElement(By.id("pass")).sendKeys("Selva@kamali1");
	        ieDriver.findElement(By.id("loginbutton")).click();Thread.sleep(5000);

	        // Add assertions or further actions as needed
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close all browser instances
	        chromeDriver.quit();
	        firefoxDriver.quit();
	        ieDriver.quit();
	    }
	}


