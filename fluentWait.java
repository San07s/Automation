package Synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		 Wait<WebDriver> wait=new FluentWait<>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .ignoring(ElementNotInteractableException.class)
				 .pollingEvery(Duration.ofMillis(100));
		 
		 wait.until(ExpectedConditions.titleContains("Facebook"));
		 driver.findElement(By.linkText("Create new account")).click();
		 Thread.sleep(2000);
		 driver.quit();
		 

	}

}
