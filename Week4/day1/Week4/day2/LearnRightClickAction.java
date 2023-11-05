package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClickAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions builder = new Actions(driver);
		builder.contextClick(rightClickEle).perform();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
	}

}
