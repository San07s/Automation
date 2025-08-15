package learnTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// This is DataProvider program it is used to run a script with using multiple datas.
public class Learning_dataProvider1{
	@DataProvider
	public String[][] loginDataProvider(){
		
	String[][]data=new String[5][2];
	
	data[0][0]="nikhil126@gmail.com";
	data[0][1]="nikhil123";
	data[1][0]="santhosh124@gmail.com";
	data[1][1]="1234567890";
	data[2][0]="prathibas2304@gmail.com";
	data[2][1]="Prathi123";
	data[3][0]="aravinth123@gmail.com";
	data[3][1]="aravinth123";
	data[4][0]="sowmiyanarayanan2001@gmail.com";
	data[4][1]="Narayanan@01";
	
	return data;
	}
	
	@Test(dataProvider = "loginDataProvider")
	public void login(String email,String password) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}

}
