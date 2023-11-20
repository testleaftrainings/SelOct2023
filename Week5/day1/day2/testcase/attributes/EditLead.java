package week5.day2.testcase.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
	
	@Test(dataProvider = "fetchData")
	public void editLeadTestcase(String phNo,String cName) throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
	}

	@DataProvider(name="fetchData")
	public String[][] sendData() {
		String[][] data = new String[3][2];

		//1st testdata
		data[0][0] = "91";
		data[0][1] = "TestLeaf";

		//2nd testdata
		data[1][0] = "99";
		data[1][1] = "QEagle";

		//3rd testdata
		data[2][0] = "90";
		data[2][1] = "Tech";
		
		return data;


	}

}
