package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_locator {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//                                  Syntax of CSSselector 1
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("santhosh");
		//                                  Syntax of CSSselector 2
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Santho");
	}

}
