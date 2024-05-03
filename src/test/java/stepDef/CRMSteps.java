package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooksDemo.BrowserSetup;
import io.cucumber.java.en.*;

public class CRMSteps 
{

	
	public WebDriver driver=BrowserSetup.getDriver();
	@Given("Automation playground crm application should be open")
	public void automation_playground_crm_application_should_be_open() 
	{
	
		
	}

	@When("user clicks on Sign In button")
	public void user_clicks_on_sign_in_button() 
	{
	   driver.findElement(By.id("SignIn")).click();
	
	}

	@Then("user should be navigated to login page")
	public void user_should_be_navigated_to_login_page() 
	{
       Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Failed to click on Sign In link");
       System.out.println("Successfully clicked on Sign In link");
		
		
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String password) 
	{
	
		driver.findElement(By.id("email-id")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() 
	{
	  driver.findElement(By.id("submit-id")).click();
	
	}

	@Then("user should be logged in for valid data only")
	public void user_should_be_logged_in_for_valid_data_only() 
	{
	
		Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"login fail");
		System.out.println("Login done");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
