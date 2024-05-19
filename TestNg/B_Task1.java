package TestNg;

import org.testng.annotations.DataProvider;

public class B_Task1  {
	
	
	
	
	@DataProvider(name="ABC")
	public Object[][] data() {
		Object[][] object=new Object[][] {{"venkatesh@gmail.com", "venkay@123"}, {"venkateshsel@gmail.com", 
			"venkatesh@123"}, {"venkat@gmail.com", "venky@234"}};
			return object;
		}

}
