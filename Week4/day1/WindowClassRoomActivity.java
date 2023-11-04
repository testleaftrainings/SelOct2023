package week4.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowClassRoomActivity {
	public static void main(String[] args) {
		//NoSuchWindowException
		//to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications");
		ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        
        
	}

}
