package flipkart.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./FeatureFile/flipkart.feature",
		dryRun = false,
		glue = "flipkart.stepdefinition",
		monochrome = true,
		plugin = {"pretty",
				"html:Reports/index.html",
				"json:Reports/data.json",
				"junit:Reports/value.xml"},
		tags = "not @regression"
		
		)

public class FlipkartTestRunner extends AbstractTestNGCucumberTests {

}
