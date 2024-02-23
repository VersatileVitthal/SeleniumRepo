package stepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterTest 
{
	public WebDriver driver;
	@Given("Open the open cart application with register page")
	public void open_the_open_cart_application_with_register_page() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
	    
	}

	@When("user enter the valid data")
	public void user_enter_the_valid_data(DataTable table) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> data=table.cells();
		
	   driver.findElement(By.id("input-firstname")).sendKeys(data.get(1).get(0));
	   driver.findElement(By.id("input-lastname")).sendKeys(data.get(1).get(1));
	   driver.findElement(By.id("input-email")).sendKeys(data.get(1).get(2));
	   driver.findElement(By.id("input-password")).sendKeys(data.get(1).get(3));
	}

	@When("user click on yes radio button")
	public void user_click_on_yes_radio_button() 
	{
	    driver.findElement(By.xpath("//div[@class='row mb-3']//div[@class='col-sm-10']//div[1]")).click();		
	}

	@When("user click on privacy policy checkbox")
	public void user_click_on_privacy_policy_checkbox() 
	{
	    driver.findElement(By.xpath("//input[@name='agree']")).click();
	
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() 
	{
	   driver.findElement(By.xpath("//button[@type='submit']")).click();   
	 	
	}

	@Then("user should get registered")
	public void user_should_get_registered() 
	{
	 
		System.out.println("User registerd successfully");
		
	}



}
