package startSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WhatsAppAutomation {
	 public static void main(String[] args) throws Exception {
	        // Automatically setup ChromeDriver
	        WebDriverManager.chromedriver();
	        WebDriver driver = new ChromeDriver();
	        
	        // Open WhatsApp Web
	        driver.get("https://web.whatsapp.com/");
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        // Ask user to scan QR code
	        System.out.println("📢 Scan the QR Code on WhatsApp Web and press Enter...");
	        Scanner scanner = new Scanner(System.in);
	        scanner.nextLine();  // Wait for user input
	        
	        String contactName = "Bujik Bujik Bro";  // Change this to your friend's name
	        String message = "Hey da! Enna panra? 😍";  // Change this to your message

	        // Search for contact
	        WebElement searchBox = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
	        searchBox.sendKeys(contactName);
	        Thread.sleep(2000);

	        WebElement contact = driver.findElement(By.xpath("//span[@title='" + contactName + "']"));
	        contact.click();
	        Thread.sleep(2000);

	        // Send message 100 times
	        WebElement msgBox = driver.findElement(By.xpath("//div[@title='Type a message']"));
	        for (int i = 1; i <= 100; i++) {
	            msgBox.sendKeys(message + " [" + i + "]");
	            WebElement sendBtn = driver.findElement(By.xpath("//button[@data-testid='compose-btn-send']"));
	            sendBtn.click();
	            Thread.sleep(500); // Small delay to avoid detection
	        }

	        System.out.println("✅ 100 Messages Sent Successfully!");
	        driver.quit();
	    }
	}

