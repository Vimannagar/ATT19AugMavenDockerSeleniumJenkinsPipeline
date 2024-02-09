package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {

	@Given("User should be at accounts opening page")
	public void user_should_be_at_accounts_opening_page() {
		System.out.println("Given statement");
	}

	@When("user enters the data in following manner")
	public void user_enters_the_data_in_following_manner(DataTable dataTable) {

		List<List<String>> data = dataTable.asLists();

		List<String> firstList = data.get(0);

		System.out.println(firstList);// print the complete list with 0th index

		String emailValue = firstList.get(2);

		System.out.println(emailValue);// printing the email value

		String name = data.get(1).get(0);// fetching name from 1st index list

		System.out.println(name);
		
		
//	reading dataTable using Map
	List<Map<String, String>> data1 = dataTable.asMaps();
		
	String lastnameValue = data1.get(0).get("lastname");
	
	System.out.println("Lastname value from Map "+lastnameValue);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("Clicking on submit button");
	}

	@Then("Account should get created")
	public void account_should_get_created() {
		System.out.println("Account got created");
	}

}
