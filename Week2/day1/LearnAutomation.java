package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAutomation {

	public static void main(String[] args) {
         //Launch Chrome Browser
         ChromeDriver driver = new ChromeDriver();
         
         //Load the url
         driver.get("http://leaftaps.com/opentaps/control/main");
         
         //to maximize
         driver.manage().window().maximize();
         
         //to get the title
         //to assign a variable
         // press ctrl+2, then press l
         String title = driver.getTitle();
         System.out.println(title);
         
         //to close the browser
         driver.close();
         

	}

}
