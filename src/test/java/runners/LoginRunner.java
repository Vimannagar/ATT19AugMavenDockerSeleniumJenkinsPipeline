package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\login.feature"},//path of the feature file to be executed
		
		glue = {"steps"}, // package name where we have the glue code available
		
		publish = true// to generate the report post to the execution 
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
