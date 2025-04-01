package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Relative_Xpath_locator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("san");
		//driver.findElement(By.xpath("")).sendKeys("san");
		//driver.findElement(By.xpath("")).click();
	}

}
