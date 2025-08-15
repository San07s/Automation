package learnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {
	
	// In priority attribute we can use negative numbers also.
	// And its default priority will be Zero(0).
	@Test(priority = 2)// Priority attribute is used to give priority, Which test case is run first.
	public void loginTest() {
		Reporter.log("User Logged in Successfully", true);
	}
	
	@Test(priority = 1)
	public void registerTest() {
		Reporter.log("User Registered Successfully", true);
	}
	
	@Test(priority = 3)
	public void shoppingTest() {
		Reporter.log("User Purchased Successfully", true);
	}
	

}
