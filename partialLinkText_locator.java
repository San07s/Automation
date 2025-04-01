package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// Using partiallinkText locator we find the location of webElement which is link.
		// then link is present inside the <a></a> anchor tag. and we have to give any part of the link.
		driver.findElement(By.partialLinkText("password?")).click();

	}

}
