package learnTestNG;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class extentReporterScreenshot {
	
	public static void main(String[] args) {

	        // Report Setup
	        ExtentSparkReporter spark = new ExtentSparkReporter("./src/main/resources/extentReporter/Google.html");
	        // Create ExtentReports object and attach the reporter 
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(spark);

	        // Creating Test
	        ExtentTest test = extent.createTest("Google Test", "Open and check title");

	        // WebDriver Setup
	        WebDriver driver = new ChromeDriver();

	        test.info("Browser started");

	        driver.get("https://www.google.com");
	        test.pass("Navigated to Google");

	        String title = driver.getTitle();
	        test.info("Page title: " + title);
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        String screenshot = ts.getScreenshotAs(OutputType.BASE64);
	        // It will attach the screenshot to the report
	        test.addScreenCaptureFromBase64String(screenshot,"Google ScreenShot");

	        driver.quit();
	        test.pass("Browser closed");

	        // Save the Report
	        extent.flush();
	    }
	}
