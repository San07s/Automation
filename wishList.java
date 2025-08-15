package learnTestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class wishList extends wishListBase{
	@Test(priority = 1)
	public void addWishList() throws IOException {
		driver.findElement(By.name("q")).sendKeys("book",Keys.ENTER);
		driver.findElement(By.xpath("//div[@data-productid='22']")).click();
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		driver.findElement(By.linkText("Wishlist")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\addToWishList.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}
	@Test(priority = 2)
	public void updateWishList() throws IOException {
		driver.findElement(By.linkText("Wishlist")).click();
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		element.clear();
		element.sendKeys("6");
		driver.findElement(By.name("updatecart")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\updateWishList.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
		
	}
	
	@Test(priority = 3)
	public void removeWishList() throws IOException {
		driver.findElement(By.linkText("Wishlist")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\reomoveWishList.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}

}
