package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		//NoSuchWindowException
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //get the title of the parent window
        String pTitle = driver.getTitle();
        System.out.println("Parent Title: "+pTitle);
        //to get the window handle
        String pWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window Handle: "+pWindowHandle);
        //click Open button
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        //to get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        //Convert Set to list
        List<String> listofHandles=new ArrayList<>(windowHandles);
        //switch to the particular window using get()
        //switch the driver focus to the child window
        driver.switchTo().window(listofHandles.get(1));
        //get the title of the child window
        String cTitle = driver.getTitle();
        System.out.println("Child Window Title is :"+cTitle);
        //verify
        if (!pTitle.equals(cTitle)) {
			System.out.println("Control switched to the new window");
		}
        else {
        	System.out.println("Control Stays in the same page");
        }
        driver.close();
        driver.switchTo().window(listofHandles.get(0));
        String title = driver.getTitle();
        System.out.println(title);
        
        
	}

}
