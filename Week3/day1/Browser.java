package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {
//	public RemoteWebDriver driver;
	public RemoteWebDriver driver;
	
	public void startApp() {
		 driver = new ChromeDriver();

	}
	
	public void startApp(String browser) {
		if (browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else if(browser.equals("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")){
			driver=new InternetExplorerDriver();;
		}

	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.startApp("ie");
		br.startApp("firefox");
		
	}

}
