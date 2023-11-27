package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion {
	public	ChromeDriver driver;

	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();	
	}

	@And("Load the url") 
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}

	@When("Click on the Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("HomePage is displayed");
		}
		else {
			System.out.println("HomePage is not displayed");
		}
	}

	@But("ErrorMessage should be displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("error")) {
			System.out.println("Error message is verified");
		}
		else {
			System.out.println("Error message is not verified");
		}
	}

    @When("Click on crmsfa link")
	public void clickCRMSFALink() {
        driver.findElement(By.partialLinkText("CRM")).click();

	}
    
    @And("Click on Leads Link")
	public void clickLeadsLink() {
       driver.findElement(By.linkText("Leads")).click();

	}
    @And("Click on CreateLead Link")
	public void clickCreateLeadLink() {
   driver.findElement(By.linkText("Create Lead")).click();

	}
	
    @Given("Enter the companyname as (.*)$")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
       
	}
    @Given("Enter the firstname as (.*)$")
	public void enterFirstNAme(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);//10233

	}
    @And("Enter the lastname as (.*)$")
	public void enterLastname(String lName) {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
    
    @When("Click on Submit button")
	public void clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

	}
    
    @Then("ViewLeadsPage should be displayed as (.*)$")
	public void verifyViewLeadsPage(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}

	}

}
