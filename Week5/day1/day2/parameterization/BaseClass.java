package week5.day2.parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public ChromeDriver driver;
    

	@BeforeSuite(alwaysRun = true)
	public void startReport() {
		System.out.println("Report started");
	}
	
	
	@BeforeTest(alwaysRun = true)
	public void setUpValues() {
		System.out.println("TestcaseDetails");

	}
	
	@BeforeClass(alwaysRun = true)
	public void startTestcase() {
		System.out.println("Details assigned");

	}

	@BeforeMethod(alwaysRun = true)
	public void preCondition() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterMethod(alwaysRun = true)
	public void postCondition() {
		driver.close();

	}
	
	@AfterSuite(alwaysRun = true)
	public void stopReport() {
		System.out.println("Report started");
	}

}
