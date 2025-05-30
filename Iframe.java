package Synchronization_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("name")).sendKeys("santhosh");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frame1);
		WebElement element2 = driver.findElement(By.id("course"));
		Select sel=new Select(element2);
		sel.selectByVisibleText("Java");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		WebElement frame2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("firstName")).sendKeys("Santhosh");
		driver.findElement(By.id("lastName")).sendKeys("B");
		driver.findElement(By.className("bcRadioButton")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("Santhosh@gamil.com");
		driver.findElement(By.id("password")).sendKeys("San077w2");
		driver.findElement(By.id("registerbtn")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("SanthoshBoo");
		WebElement frame3 = driver.findElement(By.id("frm3"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.id("name")).sendKeys("Pushpalatha");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"course\"]"));
		Select sel2=new Select(element);
		sel2.selectByVisibleText("Python");
		
		
		
		
		
		
		
		
		
	}

}
