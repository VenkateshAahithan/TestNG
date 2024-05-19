package TestNg;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class A_Task extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		browserChromeLaunch();maximize();getURL("https://omrbranch.com/");implicitWait();
	}
	@AfterClass
	private void afterclass() {
		closebrowser();	
		
	}
	@BeforeMethod
	private void beforemethod() {
		long ST = System.currentTimeMillis();
		System.out.println(ST);
	}
	@AfterClass
	private void aftermethod() {
		long ST = System.currentTimeMillis();
		System.out.println(ST);
		
	}
	@Test
	private void test() throws IOException {
		A_Task Login=new A_Task();
		Login.getCellValueof("TestNG", 2, 1);
		Login.getCellValueof("TestNG", 2, 2);
		
		
	}

}
