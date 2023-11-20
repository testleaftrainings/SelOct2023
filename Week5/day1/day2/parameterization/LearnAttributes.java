package week5.day2.parameterization;

import org.testng.annotations.Test;

public class LearnAttributes {

  @Test(priority = 3,enabled = false)
  public void mergeLead() {
	  System.out.println("Leads Merged");//5
  }
  

  @Test(priority = 1)
  public void duplicateLead() {
	  System.out.println("Duplicate Lead is Created");//3
  }
  
  @Test(enabled = false)
  public void editLead() {
	  System.out.println("Lead is Editted");//2
  }
  
  @Test(priority = 2)
  public void deleteLead() {
	  System.out.println("Lead is Deleted");//4
  }
  
  @Test(priority=-1)
  public void createLead() {
	  System.out.println("Lead Created");//1
  }
  
}
