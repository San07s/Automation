package startSel;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.get("https:/www.instagram.com/"); We can open url using this method also and 12th line method also.		
		driver.get("https://qspiders.com/");
		Thread.sleep(5000);
		
		//It will open new window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//driver.close();// It will close current controlled window(1 tab)
		driver.quit();// It will close all windows(all tabs)
	}

}
