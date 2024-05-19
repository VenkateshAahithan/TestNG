package TestNg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class E_Task1 extends BaseClass {
	public E_Task1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement LastName;
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement Mobile;
	@FindBy(xpath="//select[@id='country']")
	private WebElement SelectCountry;
	@FindBy(xpath="//input[@id='city']")
	private WebElement TextCity;
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement WriteParagraph;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getSelectCountry() {
		return SelectCountry;
	}
	public WebElement getTextCity() {
		return TextCity;
	}
	public WebElement getWriteParagraph() {
		return WriteParagraph;
	}
	public void ToolsqaRegister(String venkatesh, String selvaraj, String mobile, String email, String city, String Paragraph, String countryindia) {
		elementSendKeys(FirstName, venkatesh);
		elementSendKeys(LastName, selvaraj);
		elementSendKeys(Email, email);
		elementSendKeys(Mobile, mobile);
		elementSendKeys(TextCity, city);
		elementSendKeys(WriteParagraph, Paragraph);
		ElementDDtrribute(SelectCountry, countryindia);
		
	
	}
}
