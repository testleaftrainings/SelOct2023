package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click Show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch the driver focus to the alert
		Alert simpleAlert = driver.switchTo().alert(); 
		//read the text of the alert
		String text = simpleAlert.getText();
		System.out.println("Alert message is : "+text);
		//accept the alert
		simpleAlert.accept();
		//get the verification message
		String successMessage = driver.findElement(By.id("simple_result")).getText();
		System.out.println(successMessage);



	}

}
