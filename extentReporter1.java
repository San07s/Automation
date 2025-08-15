package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReporter1 {
	
	@Test
	public void LoginToDWS() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./src/main/resources/extentReporter/LoginToDWS.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("Welcome Page of DWS");
		
		test.log(Status.INFO, "Browser is Displayed");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		test.log(Status.INFO, "Welcome is displayed...");
		
		test.pass("Test is pass");
		
		driver.quit();
		
		extent.flush();
		
		
		
		
	}

}
