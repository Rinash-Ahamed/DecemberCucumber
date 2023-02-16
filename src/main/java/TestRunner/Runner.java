package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features/", glue = { "StepDefinitions" }, monochrome = true, plugin = { "pretty",
		"html:target/CucumberHTMLReport.html", "json:target/CucumberJSONReport.json" }, publish = true, tags = "smoke")

public class Runner {

}
