package cucumberOptionsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/Login.feature",glue = "stepDefinations",publish = true)
public class LoginRunner_TestNG extends AbstractTestNGCucumberTests {
}
