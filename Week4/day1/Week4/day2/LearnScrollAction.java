package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement scrollEle = driver.findElement(By.xpath("//span[text()='© 1996-2023, Amazon.com, Inc. or its affiliates']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(scrollEle).perform();
		System.out.println(scrollEle.getText());
		
		//to take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/amazon.png");
		FileUtils.copyFile(source, target);
		
		
		
		
		
		
		
		
		
	}

}
