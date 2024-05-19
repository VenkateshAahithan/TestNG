package TestNg;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class D_Task extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		browserChromeLaunch();
		maximize();
		getURL("https://www.facebook.com/");
		implicitWait();
	}
	
	
	
	
	
	
	@Test
	private void Test() throws IOException {
		
		
		Assert.assertTrue(getCellValueof("TestNG", 2, 1).contains("venkateshsel99@gmail.com"),"verify username");
		Assert.assertTrue(getCellValueof("TestNG", 2, 2).contains("Selva@kamali1"),"verify Password");
		
		Assert.assertEquals(getCellValueof("TestNG", 2, 1),"venkateshsel99@gmail.com","verify Username");
		Assert.assertEquals(getCellValueof("TestNG", 2, 2),"Selva@kamali1","verify password");
		
	}
	
	
	@AfterClass
	private void afterclass() {
		closebrowser();
	}
	

}
