package learnTestNG;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addToCart extends addToCartBase {
	@Test(priority = 1)
	public void addCart() throws IOException {

		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\addToCart.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
     }
	
	@Test(priority = 2)
	public void UpdateCart() throws IOException {
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("12");
		driver.findElement(By.name("updatecart")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\updateToCart.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}
	
	@Test(priority = 3)
	public void removeCart() throws IOException {
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\removeToCart.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}

}
