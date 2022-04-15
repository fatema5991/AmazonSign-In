package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.amazonLoginBase;
import com.pageobjectmodel.createAmazonPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonLoginSteps extends amazonLoginBase{

	createAmazonPages page;
	
	@Given("user on Amazon homepage")
	public void user_on_amazon_homepage() {
	   
		//getDriver();
	   
		page = PageFactory.initElements(driver,createAmazonPages.class);
		
		
		
			}
	
	@When("user clicks on Hello Sign In button")
	public void user_clicks_on_hello_sign_in_button() {
	  ///  if (driver.findElement(By.xpath("//h4[@i='\"a-popover-header-1\'")) != null);
	   
	   ///driver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
	  
	  /// else ()
		page.getSignin();
		//driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]")).click();
	
	}

	@When("user clicks on Create An Amazon Account button")
	public void user_clicks_on_create_an_amazon_account_button() {
	    
		

		page.getcreateAcctBtn();
		//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	   
	}

	@When("user enters name as {string}")
	public void user_enters_name_as(String name) {
	    //driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(name);
	    page.typename(name);
	   
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) {
	    
		page.typeemail(email);
	  //driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
	    
		
		page.Createpass(pass);
	  // driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(pass);
	}

	@When("user enters repassword as {string}")
	public void user_enters_repassword_as(String repass) {
	   //driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys(repass);
	   
		page.ReTypePass(repass);
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		 //driver.findElement(By.xpath("//input[@id='continue']")).click();
	   page.getContinueBtn();
	}

	@Then("user verifies the error message")
	public void user_verifies_the_error_message() {
		
		
		Assert.assertEquals(driver.getTitle(), "Authentication required");
	    getClose();
	    
	   
	}

	
	
}
