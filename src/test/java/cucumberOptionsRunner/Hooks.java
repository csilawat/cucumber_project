package cucumberOptionsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/hook.feature", glue = "stepDefinations",
plugin = "testng:test.xml",publish = true)
public class Hooks extends AbstractTestNGCucumberTests {
}
