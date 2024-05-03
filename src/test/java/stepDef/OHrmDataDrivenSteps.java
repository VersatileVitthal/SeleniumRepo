package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class OHrmDataDrivenSteps 
{
	public WebDriver driver;
	@Given("Orange Hrm application should be open")
	public void orange_hrm_application_should_be_open() 
	{
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String uname, String pwd) 
	{
	
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.className("oxd-button")).click();
		
	}

	@Then("user should be logged in for valid data")
	public void user_should_be_logged_in_for_valid_data() 
	{
	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login failed");
	System.out.println("Login successful");
		
	}



	
	
	
	
	
	
	
	
	
}
