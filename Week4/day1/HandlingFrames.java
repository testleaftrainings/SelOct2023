package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the driver focus to the frame by using id
		driver.switchTo().frame("dummy-chat-button-iframe");
		//click the chat widget
		driver.findElement(By.id("dummy-chat-button")).click();
		//switch to the frame
		driver.switchTo().frame("ShopifyChat");
		//type message in the message box
		driver.findElement(By.xpath("//textarea[contains(@class,'composer-bar') ]")).sendKeys("Hai");
		//close the chat widget
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		//to come to the main webPage 
		driver.switchTo().defaultContent();
		//click a product item
		driver.findElement(By.xpath("//div[@class='product-content']//a")).click();
		
		



	}

}
