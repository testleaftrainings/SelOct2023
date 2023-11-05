package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 50,70).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
