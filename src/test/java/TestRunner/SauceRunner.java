package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"AllFeatureFiles"},
		glue = {"Tests"},
		dryRun = false
		
		
		)



public class SauceRunner extends AbstractTestNGCucumberTests{

}
