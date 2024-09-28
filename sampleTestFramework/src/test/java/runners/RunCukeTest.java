package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // features = "classpath:features"
        features = "src/test/resources/features"
        ,glue={"stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reporting options
        monochrome = true // Makes the console output more readable
       // plugin ={"html:target/cucumber-report/cucumber.html"}
)

public class RunCukeTest {
}
