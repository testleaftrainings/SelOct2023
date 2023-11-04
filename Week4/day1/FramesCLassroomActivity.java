package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCLassroomActivity
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the driver focus to the iframe
		driver.switchTo().frame("iframeResult");
		//click Tryit button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch the driver focus to the alert
		driver.switchTo().alert().accept();
		//verify 
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);

		
		
				
		



	}

}
