package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	public static void main(String[] args) {
		
	    
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		List<WebElement> listOfRows = table.findElements(By.tagName("tr"));
		//rowCount
		System.out.println("RowCount is : "+listOfRows.size());
		
		//print columnCount
		List<WebElement> listOfColumns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		System.out.println("The columnCount is  : "+listOfColumns.size());
		
		// to print datas from a specific row
		List<WebElement> thirdRowData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td"));
		//iterate through a loop
		for (WebElement eachData : thirdRowData) {
			System.out.println(eachData.getText());
		}
		
		System.out.println("=========================================");
		
		//print datas from a single column
		List<WebElement> secondColumnData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
		//iterate through a loop
		for (WebElement eachColumnData : secondColumnData) {
			System.out.println(eachColumnData.getText());
		}
		System.out.println("=========================================");
		
		//to print all the datas from the entire table
//		List<WebElement> allDatas = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
//		for (WebElement eachDataofTable : allDatas) {
//			System.out.println(eachDataofTable.getText());
//		}
		
		for (int i = 1; i <= listOfRows.size(); i++) {//10
			WebElement rows = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			for (int j = 1; j <=listOfColumns.size(); j++) {
				WebElement datas = rows.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
				String text=datas.getText();
				if (!text.isEmpty()) {
					System.out.println(text);
				}
			}
			
		}
		
	}

}
