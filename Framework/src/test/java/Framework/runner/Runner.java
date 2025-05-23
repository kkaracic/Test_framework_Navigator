package Framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	  features = {"src/test/java/Framework/Feature_files/"},
	  glue = {"Framework.Steps"},
	  monochrome = true,
	  tags = {"@login"},
	  plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter: target/report.html"}
     )
public class Runner {
	
}
