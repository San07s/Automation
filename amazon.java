package startSel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("Samsung S24");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-image")).click();
		

	}

}
