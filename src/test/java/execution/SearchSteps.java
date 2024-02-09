package execution;

import driverconfig.DriverFactory2;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {

	SearchPage searchpage = new SearchPage(DriverFactory2.getDriver());
	
	@When("User enters mobile in the text box")
	public void enterTextTest()
	{
		searchpage.enterText();
	}
}
