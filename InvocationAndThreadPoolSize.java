package learnTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationAndThreadPoolSize {
	// invocationCount is used to run a script in multiple times 
	// threadPoolSize is used to open multiple window at a time 
	
	// It is One of the Parallel execution.
	@Test(invocationCount = 5,threadPoolSize = 2)
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("santhosh124@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		try {
			wait.until(ExpectedConditions.textToBe(By.className("account"), "santhosh124@gmail.com"));
			Reporter.log("Logged in Successfully", true);
		} catch (Exception e) {
			Reporter.log("Failed, to Log", true);
		}
		finally {
			driver.quit();
		}
		
	}

}
