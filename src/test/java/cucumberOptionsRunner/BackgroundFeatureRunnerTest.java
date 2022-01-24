package cucumberOptionsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature",
glue = "stepDefinations", plugin ="junit:target/junit.xml",  publish = true)
public class BackgroundFeatureRunnerTest extends AbstractTestNGCucumberTests {
}
