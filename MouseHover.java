package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// MouseHover operations is moveToElement();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
	    WebElement homeLink = driver.findElement(By.linkText("HOME"));//linkText will see the webElement not the HTML page
	    
	    Actions action = new Actions(driver);
	    // moveToElement is use to perform mouseHover.
	    action.moveToElement(homeLink).perform();
	    Thread.sleep(2000);
	    
	    WebElement clocks = driver.findElement(By.linkText("Clocks"));
	    action.moveToElement(clocks).perform();
	    Thread.sleep(2000);
	    action.click().perform();
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
