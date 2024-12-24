package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}, 
        features = "src/test/resource/FeatureFile",
        monochrome = true, 
        dryRun = false,
        glue = {"stepDef" }, 
        tags ="@Sanity")

public class Runner_test extends AbstractTestNGCucumberTests {

	


}
