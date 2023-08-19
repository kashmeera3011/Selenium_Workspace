package module_4_Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderExample 
{
	 @DataProvider(name = "loginData")
	    public Object[][] provideData() {
	        return new Object[][] {
	            {"user1", "password1"},
	            {"user2", "password2"},
	            // Add more test data here
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) {
	        System.out.println("Testing login for user: " + username + ", password: " + password);
	        // Your test logic goes here
	    }
}
