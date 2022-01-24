package cucumberOptionsRunner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/parameterizations.feature",glue = "stepDefinations")
public class Parametrization10UsersRunner extends AbstractTestNGCucumberTests {




}
