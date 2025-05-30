package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// This is Xpath By Text.     
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//                           here, ^ is a method.
		String text=driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
		// Here getText() method is used to get the text of the webPage
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
		if(text.contains("Sign In")) {
			System.out.println("Log in page displayed Successfully");
		}
	}
}
