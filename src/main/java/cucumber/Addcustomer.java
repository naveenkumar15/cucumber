package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Addcustomer extends Basepom{
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		WebDriver driver= getDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}
	@When("The user fill in the Customer details")
	public void the_user_fill_in_the_Customer_details() {
		driver.findElement(By.id("fname")).sendKeys("Naveen");
		driver.findElement(By.id("lname")).sendKeys("Kumar");
		driver.findElement(By.id("email")).sendKeys("Navinag63@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("vellore");
	    driver.findElement(By.id("telephoneno")).sendKeys("9597678063");
	}
	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		Assert.assertEquals("Please Note Down Your CustomerID",driver.findElement(By.xpath("//table//tr[2]//b")).getText());   
	}
	@Then("The user should see the customer ID")
	public void the_user_should_see_the_customer_ID() {  
		Assert.assertTrue(driver.findElement(By.xpath("//table//tr[1]//b")).isDisplayed());
	}}