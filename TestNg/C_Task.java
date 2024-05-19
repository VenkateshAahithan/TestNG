package TestNg;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class C_Task extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
		browserChromeLaunch();
		maximize();
		getURL("http://adactinhotelapp.com/");
		
	}
	@Test
	private void login() throws IOException {
		browserChromeLaunch();
		maximize();
		getURL("https://www.facebook.com/");
		
		
		Assert.assertTrue(getpageurl().contains("Hotel"),"verify");
		Assert.assertEquals(getTheTitle(), "Adactin.com - Hotel Reservation System", "verify title");
		A_Task Login=new A_Task();
		Login.getCellValueof("TestNG", 2, 1);
		Login.getCellValueof("TestNG", 2, 2);
		
		
		
	}

	
	}


