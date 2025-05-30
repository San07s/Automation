package popup_Handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Documents\\SANTHOSH RESUME 4");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		
		
		

	}

}
