package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags = "",
        plugin = {
                "html:target/html_reports/report.html",
                "json:target/json_reports/report.json"
        }

)
public class TestRunner {

}
