package learnTestNG;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//This is DataProvider program it is used to run a script with using multiple datas.
public class Learning_dataProvider2 {
	static Scanner sc=new Scanner(System.in);
	
	@DataProvider
	public String[][] registerDataProvider() {
		String [][]data=new String[5][5];
		
		// User Can give the data through manually using this method
//		data[0][0]="Santhosh";
//		data[0][1]="B";
//		data[0][2]="santhosh124@gmail.com";
//		data[0][3]="1234567890";
//		data[0][4]="1234567890";
//		
//		data[1][0]="Pushpalatha";
//		data[1][1]="S";
//		data[1][2]="pushpalatha124@gmail.com";
//		data[1][3]="0987654321";
//		data[1][4]="0987654321";
//		
//		data[2][0]="BooSan";
//		data[2][1]="SP";
//		data[2][2]="boosan124@gmail.com";
//		data[2][3]="1234509876";
//		data[2][4]="1234509876";
//		
//		data[3][0]="Boo";
//		data[3][1]="S";
//		data[3][2]="boo124@gmail.com";
//		data[3][3]="qazwsxedc";
//		data[3][4]="qazwsxedc";
//		
//		data[4][0]="San";
//		data[4][1]="B";
//		data[4][2]="san124@gmail.com";
//		data[4][3]="edcwsxqaz";
//		data[4][4]="edcwsxqaz";
		
// User can give the data through this method 
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.println("Enter your Value:");
				data[i][j]=sc.nextLine();
				}
		}
		
		return data;
		
	}
	
	@Test(dataProvider = "registerDataProvider")
	public void registerToDWS(String firstName,String LastName,String Email,String pwd,String ConfirmPWD) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPWD);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
