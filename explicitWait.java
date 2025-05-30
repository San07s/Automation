package Synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
	    // In phone and another one is jaga qsp contact which is in my whatsapp
		
	}

}
