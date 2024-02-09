package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at login page")
	public void preConditions() {
		System.out.println("Pre conditions got executed");
	}
	
	@When("User enters the username")
	public void enterUsername()
	{
		System.out.println("Entering username");
	}
	
	@When("User enters the password")
	public void enterPassword()
	{
		System.out.println("Entering password");
	}
	
	
	@When("User clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicking on login button");
	}
	
	@Then("User redirects to home page")
	public void validateLogin()
	{
		System.out.println("Validation of login");
	}
	
	@Then("page title should get display")
	public void page_title_should_get_display() {
	   System.out.println("Validating title of the page");
	}

	

}
