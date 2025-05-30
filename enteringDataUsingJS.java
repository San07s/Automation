package javaScriptSel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enteringDataUsingJS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		js.executeScript("arguments[0].click()", element);
		
		WebElement element2 = driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].value='Santhosh'", element2);
		
		WebElement element3 = driver.findElement(By.name("lastname"));
		js.executeScript("arguments[0].value='B'", element3);
		
		WebElement element4 = driver.findElement(By.id("day"));
		js.executeScript("arguments[0].value='7'", element4);
		
        WebElement element5 = driver.findElement(By.name("birthday_month"));
		js.executeScript("arguments[0].value='9'", element5);
		
		WebElement element6 = driver.findElement(By.id("year"));
		js.executeScript("arguments[0].value='2004'", element6);
		
	    WebElement element7 = driver.findElement(By.xpath("//label[text()='Male']"));
		js.executeScript("arguments[0].click()", element7);
		
		WebElement element8 = driver.findElement(By.name("reg_email__"));
		js.executeScript("arguments[0].value='8838755442'", element8);
		
		WebElement element9 = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].value='thols897Q'", element9);
		
		WebElement element10 = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		js.executeScript("arguments[0].click()", element10);
		
		
		}

}
