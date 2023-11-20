package week5.day2.parameterization;

import org.testng.annotations.Test;

public class LearndependsOnMethods {

//  @Test
//  public void mergeLead() {
//	  System.out.println("Leads Merged");
//  }
//  
//
//  @Test
//  public void duplicateLead() {
//	  System.out.println("Duplicate Lead is Created");
//  }
  
  @Test(dependsOnMethods = "LearndependsOnMethods.createLead")
  public void editLead() {
	  System.out.println("Lead is Editted");
  }
  
//  @Test
//  public void deleteLead() {
//	  System.out.println("Lead is Deleted");
//  }
  
  @Test
  public void createLead() {
	  System.out.println("Lead Created");
  }
  
}
