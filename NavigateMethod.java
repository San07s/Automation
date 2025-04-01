package startSel;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https:/www.instagram.com/"); We can open url using this method also and 12th line method also.
		driver.navigate().to("https://qspiders.com/");
		Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().to("https://qspid" + "ers.com/placements");
        Thread.sleep(5000);
        driver.navigate().to("https://qspiders.com/contactUs");
	}

}
