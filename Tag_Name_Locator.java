package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name_Locator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.infosys.com/loginiki.html");
		Thread.sleep(2000);
		
		//It will not work because in the webpage many input tag will be present
		driver.findElement(By.tagName("input")).sendKeys("San@gmail.com");
		
	}

}
