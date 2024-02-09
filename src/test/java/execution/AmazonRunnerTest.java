package execution;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"classpath:execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty","html:target/cucumber-reports/reports.html",
				"json:target/cucumcumber-report.json"
		},
		
		tags = "@sanity"
			
		)




public class AmazonRunnerTest extends AbstractTestNGCucumberTests{
	
//	wrting the data provider to perform the parallel execution
	
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
