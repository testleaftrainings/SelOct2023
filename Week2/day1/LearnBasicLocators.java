package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicLocators {

	public static void main(String[] args) {
         //Launch Chrome Browser
         ChromeDriver driver = new ChromeDriver();
         
         //Load the url
         driver.get("http://leaftaps.com/opentaps/control/main");
         
         //to maximize
         driver.manage().window().maximize();
         
        //enter the username
         driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
         
         //enter the password
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         
         //click on Login button
         driver.findElement(By.className("decorativeSubmit")).click();
         
         //click crmsfa link
         driver.findElement(By.partialLinkText("SFA")).click();
         
         //click Leads link
         driver.findElement(By.linkText("Leads")).click();

         //click createLead
         driver.findElement(By.partialLinkText("Create")).click();
         
         //enter companyname
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
         
         //enter firstname
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
         
         //enter lastname
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
         
         //click submit
         driver.findElement(By.name("submitButton")).click();
         
         //verify the text by using getText()
         String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
         System.out.println("Company name is :"+text);
	}

}
