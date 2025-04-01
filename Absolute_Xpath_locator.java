package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_locator {

	public static void main(String[] args) throws Exception {
		
		//FaceBook login page using Absolute Xpath.
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/login.php/");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("santhosh");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form/div/div/div[1]/div/input")).sendKeys("San09707");
//	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form/div[1]/div[3]/button")).click();
	    
		// Instagram login page using Absolute Xpath.
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div/section/main/div/div/div/div[2]/div/form/div/div/div/label/input")).sendKeys("Santhosh");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div/section/main/div/div/div/div[2]/div/form/div/div[2]/div/label/input")).sendKeys("san0709");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div/section/main/div/div/div/div[2]/div[1]/form/div[1]/div[3]/button")).click();
		}
}
		
		
		
		
