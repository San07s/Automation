package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		// Using name locator
     	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")).sendKeys("santhoshyufyt");
		//driver.findElement(By.name("password")).sendKeys("0987654321");
		
//		By san=By.name("password");
//		
//		WebElement passwordTextField =driver.findElement(san);
//		
//		passwordTextField.sendKeys("9090Santho");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]")).click();

		
		
		
	}

}


