package locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath_Using_XpathByAxes {
	
	// Dynamic xpath is syntax:
	
	// (1.You have to find independant component(unchangeable, like name of the product).
	// (2. Traverse to common parent)
	// (3. Traverse to dependant component(changeable , like name of the product price, offer,reviews))
	
	
	// Xpath by Axes:
	
	// 1. descendant ---> forward traversing.
	// 2. ancestor ---> backward traversing.
	// 3. following-sibling ---> traverse to parent siblings to child siblings.
	// 4. preceding-sibling ---> traverse to child siblings to parent siblings.
	
	

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("redmi phone",Keys.ENTER);
		
		// Here, example of using ancestor and descendant.
		driver.findElement(By.xpath("(//div[text()='REDMI A3X (Ocean Green, 64 GB)'])[1]/ancestor::div[@class='tUxRFH']/descendant::div[@class='Nx9bqj _4b5DiR']")).click();
		Thread.sleep(2000);
		
		// Here, example of using following-sibling.
		driver.findElement(By.xpath("(//div[text()='REDMI A3X (Ocean Green, 64 GB)']/following-sibling::div)[1]")).click();
		
		// Here, example of using preceding-sibling.
		driver.findElement(By.xpath("(//div[@class='_5OesEi'])[1]/preceding-sibling::div")).click();
		
		

	}

}
