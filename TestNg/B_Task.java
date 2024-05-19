package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class B_Task extends BaseClass {
	
	

	@Test(dataProvider = "ABC", dataProviderClass = B_Task1.class)
	private void Test(String A, String B) {
		browserChromeLaunch();
		maximize();
		getURL("https://omrbranch.com/");
		
		
		System.out.println(A);
		System.out.println(B);
	}
	
	@DataProvider(name="abc")
	public Object[][] datas() {
		Object[][] obj=new Object[2][2];
		obj[0][0]="venkateshsel99@gmail.com";
		obj[0][1]="venky@123";
		
		obj[1][0]="venkateshsel@gmail.com";
		obj[1][1]="venkat@123";
		return obj;
	}
	
	}


