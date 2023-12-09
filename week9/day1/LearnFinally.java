package week9.day1;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFinally {

	public static void main(String[] args) throws IOException {
		try {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps");
			driver.findElement(By.id("username123")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.close();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}
		

	}

}
