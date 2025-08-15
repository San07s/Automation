package learnTestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Address extends AddressBase {
	@Test(priority = 1)
	public void AddressAdd() throws InterruptedException, IOException {
		Actions move=new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Addresses"));
		move.scrollToElement(element);
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("Santhosh");
		driver.findElement(By.id("Address_LastName")).sendKeys("B");
		driver.findElement(By.id("Address_Email")).sendKeys("santhosh124@gmail.com");
		driver.findElement(By.id("Address_Company")).sendKeys("ABT45H");
		WebElement element2 = driver.findElement(By.id("Address_CountryId"));
		Select sel=new Select(element2);
		sel.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("Chennai");
		driver.findElement(By.id("Address_Address1")).sendKeys("Chennai, Vadapalani");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("606801");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9080755564");
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("DRV546");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\addToAddress.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}
	@Test(priority = 2)
	public void ModifyAddress() throws IOException {
		Actions move=new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Addresses"));
		move.scrollToElement(element);
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		WebElement city = driver.findElement(By.id("Address_City"));
		city.clear();
		city.sendKeys("kerla");
		WebElement village = driver.findElement(By.id("Address_Address1"));
		village.clear();
		village.sendKeys("kerla, Kozhikode");
		WebElement zipcode = driver.findElement(By.id("Address_ZipPostalCode"));
		zipcode.clear();
		zipcode.sendKeys("707801");
		WebElement phNumber = driver.findElement(By.id("Address_PhoneNumber"));
		phNumber.clear();
		phNumber.sendKeys("9080733365");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\ModifyAddress.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}
	@Test(priority = 3)
	public void DeleteAddress() throws IOException {
		Actions move=new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Addresses"));
		move.scrollToElement(element);
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().alert().accept();	
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Screenshots\\DeleteAddress.png");
        org.openqa.selenium.io.FileHandler.copy(screenshotAs, file);
	}
}
