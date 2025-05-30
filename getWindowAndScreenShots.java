package startSel;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getWindowAndScreenShots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("phone",Keys.ENTER);
		
		for (int i = 1; i <= 5; i++) {
			
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])["+i+"]")).click();
		}
		String ParentID = driver.getWindowHandle();
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		allWindowIDs.remove(ParentID);
		
		for (String windowID : allWindowIDs) {
			driver.switchTo().window(windowID);
			 String title = driver.getTitle();
			 if(title.contains("CMF")) {
				 TakesScreenshot ts=(TakesScreenshot) driver;
				 File screenshot = ts.getScreenshotAs(OutputType.FILE);
//				 File destination=new File("C:/Screenshots/"+title+".png"); 
				 File destination=new File("./screenshots/"+title+".png");
				 FileHandler.copy(screenshot, destination);
			 }
			 else {
				 driver.close();
			 }
			
		}

	}

}
