package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		for (int i = 1; i<=7; i++) {
			WebElement drag = driver.findElement(By.id("box"+i));
			WebElement drop = driver.findElement(By.id("box10"+i));
			Actions action = new Actions(driver);
			action.dragAndDrop(drag, drop).perform();
			
		}
	}

}
