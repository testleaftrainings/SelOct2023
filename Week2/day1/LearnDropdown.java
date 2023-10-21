package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

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
         
         //click source dropdown
         WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
         
         //
         Select sec = new Select(sourceDD);
         
         //select cold call option
         sec.selectByIndex(1);
         
         //click Industry dropdown
         WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
         
         //Instantiate Select class
         Select sec1 = new Select(industryDD);
         
         //select computer software option
         sec1.selectByVisibleText("Computer Software");
         
         //select marketing campaign dropdown
         WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         
         Select sec2 = new Select(marketingDD);
         //select pay by option
         sec2.selectByValue("9001");
         
         
         //click submit
//         driver.findElement(By.name("submitButton")).click();
//         
//         //verify the text by using getText()
//         String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//         System.out.println("Company name is :"+text);
	}

}
