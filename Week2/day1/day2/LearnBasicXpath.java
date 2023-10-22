package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnBasicXpath {

	public static void main(String[] args) throws InterruptedException {
         //Launch Chrome Browser
         ChromeDriver driver = new ChromeDriver();
         
         //Load the url
         driver.get("http://leaftaps.com/opentaps/control/main");
         
         //to maximize
         driver.manage().window().maximize();
         
         //apply ImplicityWait
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
        //enter the username
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
         
         Thread.sleep(3000);
         //enter the password
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
         
         //click on Login button
         driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
         
         //click crmsfa link
         driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
         
         //click Leads link
         driver.findElement(By.xpath("//a[text()='Leads']")).click();

         //click createLead
         driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
         
         //enter companyname
         driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");
         
         //enter firstname
         driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Subraja");
         
         //enter lastname
         driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("S");
         
         //click source dropdown
         WebElement sourceDD = driver.findElement(By.xpath("//select[contains(@id,'dataSource')]"));
         
         //
         Select sec = new Select(sourceDD);
         
         //select cold call option
         sec.selectByIndex(1);
         
         //click Industry dropdown
         WebElement industryDD = driver.findElement(By.xpath("//select[contains(@id,'industry')]"));
         
         //Instantiate Select class
         Select sec1 = new Select(industryDD);
         
         //select computer software option
         sec1.selectByVisibleText("Computer Software");
         
         //select marketing campaign dropdown
         WebElement marketingDD = driver.findElement(By.xpath("//select[contains(@id,'marketing')]"));
         
         Select sec2 = new Select(marketingDD);
         //select pay by option
         sec2.selectByValue("9001");
         
         
         //click submit
         driver.findElement(By.xpath("//input[@name='submitButton']")).click();
         
         //verify the text by using getText()
         String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
         System.out.println("Company name is :"+text);
	}

}
