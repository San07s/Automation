package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi 9i");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='(Refurbished) Redmi 9i (Sea Blue, 4GB RAM, 128GB Storage)']/../../../../..//span[@class='a-price-whole']")).click();
//		Thread.sleep(3000);
//		JavascriptExecutor s = (JavascriptExecutor) driver;
//		s.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.id("add-to-cart-button")).click();

		
		    
		  
	}
}
