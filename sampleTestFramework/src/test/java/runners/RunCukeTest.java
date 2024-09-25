package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features"
        //features = "src\\test\\resources\\features"
        ,glue={"stepdefinitions"},
        plugin ={"html:target/cucumber-report/cucumber.html"}
)

public class RunCukeTest {
}
