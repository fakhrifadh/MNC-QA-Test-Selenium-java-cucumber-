package runners;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/results/login/cucumber-report.json",  "html:target/login/runner"},
        features = "src/test/resources/features",
        glue = "steps"
)

public class Runner extends BaseRunner {
}
