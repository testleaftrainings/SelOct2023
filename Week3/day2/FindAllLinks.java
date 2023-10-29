package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        
        //to find the size of list
        System.out.println("The total no: of links in this page is :"+allLinks.size());
        System.out.println(allLinks);
        //to get the 2nd linkText of this page
        System.out.println(allLinks.get(2).getText());
        
        //Create a List
        List<String> list = new ArrayList<>();
       
        //to print all linkText
        //    Type      variablename: listname
         for (int i = 0; i < allLinks.size(); i++) {
			String text=allLinks.get(i).getText();
			list.add(text);
		}
        
        Collections.sort(list);
        System.out.println(list);
        
        String firstElement = list.get(0);
        System.out.println("FirstElement is : "+firstElement);
        
        
	}
}
