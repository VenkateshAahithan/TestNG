package TestNg;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class E_Task extends BaseClass {
	
	@BeforeClass
	private void beforeclass() {
		browserChromeLaunch();
		maximize();
		implicitWait();
		getURL("https://www.toolsqa.com/selenium-training/#enroll-form");
		
	}
	
	@Test
	private void Test() throws IOException {
		E_Task1 TS=new E_Task1();
		TS.ToolsqaRegister(getCellValueof("ToothSqaRegister", 2, 1), 
				getCellValueof("ToothSqaRegister", 2, 2),
				getCellValueof("ToothSqaRegister", 2, 4),
				getCellValueof("ToothSqaRegister", 2, 3),
				getCellValueof("ToothSqaRegister", 2, 5),
				getCellValueof("ToothSqaRegister", 2, 7),
				getCellValueof("ToothSqaRegister", 2, 6));
		
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 1), "venkatesh", "verify firstname");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 1).contains("venkatesh"), "verify firstname");
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 2), "selvaraj", "verify lastname");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 2).contains("selvaraj"), "verify lastname");
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 4), "7598348238", "verify mobile");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 4).contains("7598348238"), "verify mobile");
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 3), "venkateshsel99@gmail.com", "verify email");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 3).contains("venkateshsel99@gmail.com"), "verify email");
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 5), "chennai", "verify city");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 5).contains("chennai"), "verify city");
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 6), "4", "verify country");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 6).contains("4"), "verify country");
		
		Assert.assertEquals(getCellValueof("ToothSqaRegister", 2, 7), "I like to use ToolSqa Website", "verify paragraph");
		Assert.assertTrue(getCellValueof("ToothSqaRegister", 2, 7).contains("I like to use ToolSqa Website"), "verify paragraph");
		
		
	}
	@AfterClass
	private void afterclass() {
		closebrowser();
	}

}
