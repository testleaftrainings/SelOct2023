package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus",Keys.ENTER);
		List<WebElement> mobiles = driver.findElements(By.className("a-price-whole"));
		List<String> list = new ArrayList<>();
		for (WebElement each : mobiles) {
			String text = each.getText();
			list.add(text);
		}    
	
		System.out.println(list.size());
		
		//Declare Set
		Set<String> unique = new LinkedHashSet<>(list);
		System.out.println(unique.size());
		
		
		if (list.size()!=unique.size()) {
			System.out.println("Duplicates are  present");
		}
		else {
			System.out.println("Duplicates not present");
		}
		
		
		
		
		//Set removes duplicate
	    /*Set-> Interface 
	     *Properties of Set-> Set doesnot allow Duplicate values
	     *Implementation Classes
	     * HashSet          - random order
	     * LinkedHashSet    - Insertion Order
	     * TreeSet          - Sorted order
	     * 
	     * get() is not available in Set 
	     * 
	     */

	}
}
