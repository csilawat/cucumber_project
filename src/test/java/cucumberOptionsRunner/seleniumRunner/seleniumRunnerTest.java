package cucumberOptionsRunner.seleniumRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/selenium.feature", glue = "stepDefinations/selenium")
public class seleniumRunnerTest extends AbstractTestNGCucumberTests {
}
