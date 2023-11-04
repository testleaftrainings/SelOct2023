package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click Show button
		driver.findElement(By.xpath("//h5[contains(text(),' (Prompt Dialog)')]/following::span")).click();
		//switch the driver focus to the alert
		Alert promptAlert = driver.switchTo().alert();
		//read the text of the alert
		String alertMsg = promptAlert.getText();
		//print the alert msg
		System.out.println(alertMsg);
		//pass input to the alert
		Thread.sleep(3000);
		promptAlert.sendKeys("Subraja");
		//cancel the alert
		promptAlert.accept();
		//read the verification message
		String text = driver.findElement(By.id("confirm_result")).getText();
		//print the success message
		System.out.println(text);
		
		
		



	}

}
