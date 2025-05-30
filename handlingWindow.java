package startSel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		String ParentwindowID = driver.getWindowHandle();
		Set<String> AllWindowID = driver.getWindowHandles();
		
		AllWindowID.remove(ParentwindowID);
		
		for(String singleID:AllWindowID) {
			driver.switchTo().window(singleID);
			System.out.println("Title of Child Window is:"+driver.getTitle());
			Thread.sleep(5000);
			
			try {
				// if it is addTo cart Icon
				driver.findElement(By.xpath("//*[name()='svg' and @class='KRzcNw']")).click();
			}catch(Exception e) {
				driver.findElement(null)
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
