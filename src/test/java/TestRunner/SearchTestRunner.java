package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/FeatureTest",
			glue = {"stepDefinitions"},
			plugin = {
					"html:reporting/CucumberHTMLReports/sanity"
}
			)
	


public class SearchTestRunner {

}
