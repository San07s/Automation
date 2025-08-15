package learnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Attribute {
	public class SimpleTest {
		@Test(enabled = false)//enabled is used to convey test cases is visible are not.
		public void loginTest() {
			// Reporter.log is use to print the result of the console
			Reporter.log("User logged successfully",true); 
		}
		@Test
		public void registerTest() {
			Reporter.log("User Registered Successfully", false);		}
		@Test(dependsOnMethods = "registerTest")//dependsOnMethods is conveys shoppingTest() is depends on registerTest().(it means registerTest is work after only it will execute)
		public void shoppingTest() {
			Reporter.log("User Purchased Successfully", true);
		}
		

	}
}
