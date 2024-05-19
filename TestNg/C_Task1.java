package TestNg;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.BaseClass;

public class C_Task1 extends BaseClass {
	@Test
	private void softassert() throws IOException {
		browserChromeLaunch();
		maximize();
		getURL("http://adactinhotelapp.com/");
		
		SoftAssert SP=new SoftAssert();
		SP.assertTrue(getpageurl().contains("Hotel"),"verify url");
		SP.assertEquals(getTheTitle(), "Adactin.com - Hotel Reservation System", "verify title");
		
		A_Task Login=new A_Task();
		Login.getCellValueof("TestNG", 2, 1);
		Login.getCellValueof("TestNG", 2, 2);
		
//		TO highlight Assert failure
		SP.assertAll();
	}

}
