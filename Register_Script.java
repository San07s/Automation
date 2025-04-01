package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		// Using id Locator
//		driver.navigate().to("https://demowebshop.tricentis.com/register");
//		driver.findElement(By.id("gender-male")).click();
//		driver.findElement(By.id("FirstName")).sendKeys("Santhosh");
//		driver.findElement(By.id("LastName")).sendKeys("B");
//		driver.findElement(By.id("Email")).sendKeys("santhosh@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Santhosh");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("Santhosh");
//		driver.findElement(By.id("register-button")).click();
		
		//Using cssSelector locator
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		driver.findElement(By.cssSelector("[id='gender-male']")).click();
		driver.findElement(By.cssSelector("[data-val=\"true\"]")).sendKeys("Santhosh");
		driver.findElement(By.cssSelector("[data-val-required=\"Last name is required.\"]")).sendKeys("B");
		driver.findElement(By.cssSelector("[data-val-email=\"Wrong email\"]")).sendKeys("santhosh@gmail.com");
		driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("Santhosh");
		driver.findElement(By.cssSelector("[id=\"ConfirmPassword\"]")).sendKeys("Santhosh");
		driver.findElement(By.cssSelector("[value=\"Register\"]")).click();

	}
}

