package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmAlert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Click Show button
        driver.findElement(By.xpath("//h5[contains(text(),' (Confirm Dialog)')]/following::span")).click();
        //switch the driver focus to the Alert
        Alert confirmAlert = driver.switchTo().alert();
        String alertMsg = confirmAlert.getText();
        System.out.println("Alert message is : "+alertMsg);
        confirmAlert.dismiss();
        String text = driver.findElement(By.id("result")).getText();
        System.out.println(text);
       
        
        
        
	}

}
