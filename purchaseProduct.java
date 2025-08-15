package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class purchaseProduct extends purchaseProductBase{
	@Test(groups = {"sanityGroup","smokeGroup"})
	public void addProduct() {
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
//label[text()='Select a billing address from your address book or enter a new address.']/ancestor::div[@class='step a-item']/decendant::
		
	}
}
