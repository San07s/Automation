package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		// finding the location
		
		By id=By.id("email");
		
		// It will find the webElement
		WebElement emailTextField =driver.findElement(id);
		
		//Enter the data
		emailTextField.sendKeys("santho@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Santhosh");
		
		driver.findElement(By.name("login")).click();
		
		

	}

}
