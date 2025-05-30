package startSel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takesScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		
	    TakesScreenshot ts =(TakesScreenshot) driver;
	    
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
//	    File destination = new File("./se/screenshots/myntra143.png");
        File destination = new File("D:/screenshots/myntra.png");
	    
	    FileHandler.copy(source, destination);
	    
	    driver.quit();
	    
	    
	}
}
//
//
//
//package startSel;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//
//public class takesScreenshot {
//
//    public static void main(String[] args) throws IOException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.myntra.com/");
//
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//
//        // Set the full path where you want to save the screenshot
//        String folderPath = "C:/Screenshots";
//        String filePath = folderPath + "/myntra.png";
//        File destination = new File(filePath);
//
//        // Check if folder exists, if not, create it
//        File folder = new File(folderPath);
//        if (!folder.exists()) {
//            folder.mkdirs();
//        }
//
//        // Copy the screenshot to destination
//        FileHandler.copy(source, destination);
//
//        System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
//
//        driver.quit();
//    }
//}
