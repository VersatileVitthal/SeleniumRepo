 package stepDef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLoginTest 
{
    public WebDriver driver;
	@Given("Open cart login page should be open")
	public void open_cart_login_page_should_be_open() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	}

	@When("user enters valid data using data table")
	public void user_enters_valid_data_using_data_table(DataTable table) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    // List<List<String>> data=table.cells();
		List<Map<String, String>>data=table.asMaps(String.class, String.class);
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("emailid"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("psw"));
		
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user shoud be logged in his account")
	public void user_shoud_be_logged_in_his_account() 
	{
		System.out.println("User is logged in successfully");
		
	}



	
	
	
	
	
	
	
	
	
	
	
}
