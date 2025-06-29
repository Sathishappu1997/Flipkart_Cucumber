package flipkart.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./FeatureFile/searchproduct.feature",
		dryRun = false,
		glue = "flipkart.stepdefinition",
		monochrome = true,
		plugin = {"pretty",
				"html:Reports/SearchProduct.html",
				"json:Reports/SearchProduct.json",
				"junit:Reports/SearchProduct.xml"},
		tags = "(@regression or @sanity)"

		)

public class SearchProductTestRunner extends AbstractTestNGCucumberTests{

}
