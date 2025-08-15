package learnTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//         DATA DRIVEN TESTING
// In this program we are fetching data from file.
public class Learning_properties_file {
	@Test
	public void logintoDWS() throws IOException {
		// The data is present in (commonDataProperties) so we give the path of that file .
		FileInputStream fis=new FileInputStream("./src/main/resources/commonDataProperties");
		// Here, property is take the data from FileInputStream(fis).
		Properties property=new Properties();
		// load the file into properties class object
		property.load(fis);
		String url = property.getProperty("URL");
		String email = property.getProperty("Email");
		String pwd = property.getProperty("Password");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
}
