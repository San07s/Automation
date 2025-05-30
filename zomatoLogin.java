package Synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatoLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Log in")).click();
		
	//  driver.switchTo().frame(7);
		driver.switchTo().frame(driver.findElement(By.id("auth-login-ui")));
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9080755563");
		
		driver.findElement(By.xpath("//*[name()='svg'] and @class='sc-rbbb40-0 fJjczH'")).click();
		// then we have to go for upper parent
		
		

	}

}
