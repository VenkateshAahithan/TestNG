package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class I_POMTask {
	

    private WebDriver driver;
    private String baseUrl = "https://www.facebook.com/";

    // Locators
    private By emailFieldLocator = By.id("email");
    private By passwordFieldLocator = By.id("pass");
    private By loginButtonLocator = By.name("u_0_5_i4");

    public I_POMTask(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get(baseUrl);
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}


