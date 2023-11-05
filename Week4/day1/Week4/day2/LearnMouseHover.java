package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		//locate the ele and assign it to a variable
		WebElement eleMen = driver.findElement(By.linkText("MEN"));
		//Instantiate Actions class
		Actions builder = new Actions(driver);
		//use the actions object and call the required methods
		builder.moveToElement(eleMen).perform();
		
		
		
		
		
		
		
		
	}

}
