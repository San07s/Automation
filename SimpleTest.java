package learnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleTest {
	@Test
	public void loginTest() {
		// Reporter.log is use to print the result of the console
		Reporter.log("User logged successfully",true);// Here, true means it will print this message in the console.
	}
	@Test
	public void registerTest() {
		Reporter.log("User Registered Successfully", false);// Here, false means it will not print this message in the console.
	}
	@Test
	public void shoppingTest() {
		Reporter.log("User Purchased Successfully", true);
	}
	

}
