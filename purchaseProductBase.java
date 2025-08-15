package learnTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class purchaseProductBase { 
	public WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	}
	
	@BeforeMethod
	public void loginToApp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("santhosh124@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logoutFromApp() {
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	

}
