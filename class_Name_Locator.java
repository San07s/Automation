package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_Name_Locator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.infosys.com/loginiki.html");
		Thread.sleep(2000);
		//Using className locator
		driver.findElement(By.className("email-icon")).sendKeys("santhosh09707");
		driver.findElement(By.className("pwd-icon")).sendKeys("san");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
		driver.close();
	}

}
