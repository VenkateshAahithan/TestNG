package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class F_Task extends BaseClass {
	@Parameters({"BrowserName"})
	@Test
	private void Tc1( String BrowserName) {
		
		switch(BrowserName) {
		case "chrome":
			browserChromeLaunch();
			break;	
		case "edge":
			browseredgeLaunch();
			break;
		case "firefox":
			browserFireFoxLaunch();
			break;	
		}
		getURL("http://adactinhotelapp.com/");
		
	}

	
}

