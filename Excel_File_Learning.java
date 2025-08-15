package learnTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtilities.File_Utility;

public class Excel_File_Learning {
	@Test
	public void registerScript() throws Exception, IOException {
	
	FileInputStream fis=new FileInputStream("./src/main/resources/RegisterData1.xlsx");
	
	Workbook book=WorkbookFactory.create(fis);
	
	Sheet sheet = book.getSheet("RegisterToDWS");
	
	Row row = sheet.getRow(1);
	
	Cell cell = row.getCell(0);
	
	String gender = cell.getStringCellValue();
	String firstName = row.getCell(1).getStringCellValue();
	String lastName = row.getCell(2).getStringCellValue();
	String email = row.getCell(3).getStringCellValue();
	String password = row.getCell(4).getStringCellValue();
	String confirmPassword = row.getCell(5).getStringCellValue();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(File_Utility.getPropertyData("URL"));
	driver.findElement(By.linkText("Register")).click();
	
	if (gender.equalsIgnoreCase("male")) {
		driver.findElement(By.id("gender-male"));
		
	} else {
		driver.findElement(By.id("gender-female"));

	}
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
	driver.findElement(By.id("register-button")).click();
	driver.quit();
	
	}
}
