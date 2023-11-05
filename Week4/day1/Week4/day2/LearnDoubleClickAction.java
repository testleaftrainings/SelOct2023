package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClickAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame("iframeResult");
		WebElement doubleClickEle = driver.findElement(By.xpath("//p[contains(text(),'Double-click')]"));
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleClickEle).perform();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
	}

}