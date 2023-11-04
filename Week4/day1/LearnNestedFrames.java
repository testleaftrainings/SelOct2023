package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the parent frame by using WebElement
		WebElement frameEle = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
		driver.switchTo().frame(frameEle);
		//switch to the nested frame
		driver.switchTo().frame("frame2");
		//click the buuton inside the frame
		driver.findElement(By.id("Click")).click();
		
		
				
		



	}

}
