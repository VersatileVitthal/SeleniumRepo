package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonTest 
{
	 public WebDriver driver;
	
	@Given("Open amazon homepage")
	public void open_amazon_homepage() 
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in/");
		
	}

	@When("user captures the title of homepage")
	public void user_captures_the_title_of_homepage() 
	{
	   System.out.println("Ttile of homapage: "+driver.getTitle()); 
	   
	}

	@Then("Current title should match with homepage expected title")
	public void current_title_should_match_with_homepage_expected_title() 
	{
		Assert.assertTrue(driver.getTitle().contains("Amazon"),"Title not matched");
		System.out.println("Title matched");
		
	}

	@When("user captures the title of Best seller page")
	public void user_captures_the_title_of_best_seller_page() 
	{
	  driver.findElement(By.linkText("Best Sellers")).click();
	  System.out.println("Title of BestSeller page is: "+driver.getTitle());
		
	}

	@Then("Current title should match with Bestseller page expected title")
	public void current_title_should_match_with_bestseller_page_expected_title() 
	{
		Assert.assertTrue(driver.getTitle().contains("Bestseller"),"Title not matched");
		System.out.println("Title matched");
		
	}

	@When("user captures the title of mobile page")
	public void user_captures_the_title_of_mobile_page() 
	{
	  driver.findElement(By.linkText("Mobiles")).click();
	  System.out.println("Title of mobile page is: "+driver.getTitle());
	}

	@Then("Current title should match with mobile page expected title")
	public void current_title_should_match_with_mobile_page_expected_title() 
	{
		Assert.assertTrue(driver.getTitle().contains("Mobile"),"Title not matched");
		System.out.println("Title matched");

	}

	@When("user captures the title of todays deal page")
	public void user_captures_the_title_of_todays_deal_page() 
	{
	   driver.findElement(By.linkText("Today's Deals")).click();
	   System.out.println("Title of todays deal page is: "+driver.getTitle());
		
	}

	@Then("Current title should match with todays deal page expected title")
	public void current_title_should_match_with_todays_deal_page_expected_title() 
	{
	
		Assert.assertTrue(driver.getTitle().contains("Amazon"),"Title not matched");
		System.out.println("Title matched");
	}




}
