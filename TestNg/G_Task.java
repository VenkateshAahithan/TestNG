package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G_Task {
	public class FacebookLoginTest {

	    // Method to verify username and password
	    public boolean verifyCredentials(String username, String password) {
	        // For the sake of simplicity, let's assume correct username and password
	        String correctUsername = "venkateshsel99@gmail.com";
	        String correctPassword = "venky@123";
	        
	        return correctUsername.equals(username) && correctPassword.equals(password);
	    }

	    @Test
	    public void testCorrectCredentials() {
	        String username = "venkateshsel99@gmail.com";
	        String password = "venky@123";
	        Assert.assertTrue(verifyCredentials(username, password));
	    }

	    @Test
	    public void testIncorrectUsername() {
	        String username = "wrong_user";
	        String password = "venky@123";
	        Assert.assertFalse(verifyCredentials(username, password));
	    }

	    @Test
	    public void testIncorrectPassword() {
	        String username = "venkateshsel99@gmail.com";
	        String password = "wrong_password";
	        Assert.assertFalse(verifyCredentials(username, password));
	    }
	}

}
