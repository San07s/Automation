package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//                 This is using xpath by text.
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//                 This is using xpath by index.
		driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("tamanna");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("bhatia");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("kavala@gamil.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("rajini@gamil.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("rajini@gamil.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		}
}
