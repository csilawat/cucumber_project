package cucumberOptionsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/DataTableForMultiplesValues.feature",
glue = "stepDefinations")
public class DataTableForMultipleValues extends AbstractTestNGCucumberTests {
}
